/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pubsub;

// [START pubsub_create_topic_with_azure_event_hubs_ingestion]

import com.google.cloud.pubsub.v1.TopicAdminClient;
import com.google.pubsub.v1.IngestionDataSourceSettings;
import com.google.pubsub.v1.Topic;
import com.google.pubsub.v1.TopicName;
import java.io.IOException;

public class CreateTopicWithAzureEventHubsIngestionExample {
  public static void main(String... args) throws Exception {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "your-project-id";
    String topicId = "your-topic-id";
    // Azure Event Hubs ingestion settings.
    String resourceGroup = "resource-group";
    String namespace = "namespace";
    String eventHub = "event-hub";
    String clientId = "client-id";
    String tenantId = "tenant-id";
    String subscriptionId = "subscription-id";
    String gcpServiceAccount = "gcp-service-account";

    createTopicWithAzureEventHubsIngestionExample(
        projectId,
        topicId,
        resourceGroup,
        namespace,
        eventHub,
        clientId,
        tenantId,
        subscriptionId,
        gcpServiceAccount);
  }

  public static void createTopicWithAzureEventHubsIngestionExample(
      String projectId,
      String topicId,
      String resourceGroup,
      String namespace,
      String eventHub,
      String clientId,
      String tenantId,
      String subscriptionId,
      String gcpServiceAccount)
      throws IOException {
    try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
      TopicName topicName = TopicName.of(projectId, topicId);

      IngestionDataSourceSettings.AzureEventHubs azureEventHubs =
          IngestionDataSourceSettings.AzureEventHubs.newBuilder()
              .setResourceGroup(resourceGroup)
              .setNamespace(namespace)
              .setEventHub(eventHub)
              .setClientId(clientId)
              .setTenantId(tenantId)
              .setSubscriptionId(subscriptionId)
              .setGcpServiceAccount(gcpServiceAccount)
              .build();
      IngestionDataSourceSettings ingestionDataSourceSettings =
          IngestionDataSourceSettings.newBuilder().setAzureEventHubs(azureEventHubs).build();

      Topic topic =
          topicAdminClient.createTopic(
              Topic.newBuilder()
                  .setName(topicName.toString())
                  .setIngestionDataSourceSettings(ingestionDataSourceSettings)
                  .build());

      System.out.println(
          "Created topic with Azure Event Hubs ingestion settings: " + topic.getAllFields());
    }
  }
}
// [END pubsub_create_topic_with_azure_event_hubs_ingestion]
