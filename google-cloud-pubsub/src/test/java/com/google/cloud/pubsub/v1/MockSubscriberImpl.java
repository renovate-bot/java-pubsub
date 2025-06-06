/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.pubsub.v1;

import com.google.api.core.BetaApi;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import com.google.pubsub.v1.AcknowledgeRequest;
import com.google.pubsub.v1.CreateSnapshotRequest;
import com.google.pubsub.v1.DeleteSnapshotRequest;
import com.google.pubsub.v1.DeleteSubscriptionRequest;
import com.google.pubsub.v1.GetSnapshotRequest;
import com.google.pubsub.v1.GetSubscriptionRequest;
import com.google.pubsub.v1.ListSnapshotsRequest;
import com.google.pubsub.v1.ListSnapshotsResponse;
import com.google.pubsub.v1.ListSubscriptionsRequest;
import com.google.pubsub.v1.ListSubscriptionsResponse;
import com.google.pubsub.v1.ModifyAckDeadlineRequest;
import com.google.pubsub.v1.ModifyPushConfigRequest;
import com.google.pubsub.v1.PullRequest;
import com.google.pubsub.v1.PullResponse;
import com.google.pubsub.v1.SeekRequest;
import com.google.pubsub.v1.SeekResponse;
import com.google.pubsub.v1.Snapshot;
import com.google.pubsub.v1.StreamingPullRequest;
import com.google.pubsub.v1.StreamingPullResponse;
import com.google.pubsub.v1.SubscriberGrpc.SubscriberImplBase;
import com.google.pubsub.v1.Subscription;
import com.google.pubsub.v1.UpdateSnapshotRequest;
import com.google.pubsub.v1.UpdateSubscriptionRequest;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockSubscriberImpl extends SubscriberImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockSubscriberImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void createSubscription(
      Subscription request, StreamObserver<Subscription> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Subscription) {
      requests.add(request);
      responseObserver.onNext(((Subscription) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateSubscription, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Subscription.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getSubscription(
      GetSubscriptionRequest request, StreamObserver<Subscription> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Subscription) {
      requests.add(request);
      responseObserver.onNext(((Subscription) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetSubscription, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Subscription.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateSubscription(
      UpdateSubscriptionRequest request, StreamObserver<Subscription> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Subscription) {
      requests.add(request);
      responseObserver.onNext(((Subscription) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateSubscription, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Subscription.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listSubscriptions(
      ListSubscriptionsRequest request,
      StreamObserver<ListSubscriptionsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListSubscriptionsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListSubscriptionsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListSubscriptions, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListSubscriptionsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteSubscription(
      DeleteSubscriptionRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteSubscription, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void modifyAckDeadline(
      ModifyAckDeadlineRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ModifyAckDeadline, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void acknowledge(AcknowledgeRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method Acknowledge, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void pull(PullRequest request, StreamObserver<PullResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PullResponse) {
      requests.add(request);
      responseObserver.onNext(((PullResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method Pull, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PullResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public StreamObserver<StreamingPullRequest> streamingPull(
      final StreamObserver<StreamingPullResponse> responseObserver) {
    StreamObserver<StreamingPullRequest> requestObserver =
        new StreamObserver<StreamingPullRequest>() {
          @Override
          public void onNext(StreamingPullRequest value) {
            requests.add(value);
            final Object response = responses.remove();
            if (response instanceof StreamingPullResponse) {
              responseObserver.onNext(((StreamingPullResponse) response));
            } else if (response instanceof Exception) {
              responseObserver.onError(((Exception) response));
            } else {
              responseObserver.onError(
                  new IllegalArgumentException(
                      String.format(
                          "Unrecognized response type %s for method StreamingPull, expected %s or"
                              + " %s",
                          response == null ? "null" : response.getClass().getName(),
                          StreamingPullResponse.class.getName(),
                          Exception.class.getName())));
            }
          }

          @Override
          public void onError(Throwable t) {
            responseObserver.onError(t);
          }

          @Override
          public void onCompleted() {
            responseObserver.onCompleted();
          }
        };
    return requestObserver;
  }

  @Override
  public void modifyPushConfig(
      ModifyPushConfigRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ModifyPushConfig, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getSnapshot(GetSnapshotRequest request, StreamObserver<Snapshot> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Snapshot) {
      requests.add(request);
      responseObserver.onNext(((Snapshot) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetSnapshot, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Snapshot.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listSnapshots(
      ListSnapshotsRequest request, StreamObserver<ListSnapshotsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListSnapshotsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListSnapshotsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListSnapshots, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListSnapshotsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void createSnapshot(
      CreateSnapshotRequest request, StreamObserver<Snapshot> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Snapshot) {
      requests.add(request);
      responseObserver.onNext(((Snapshot) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateSnapshot, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Snapshot.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateSnapshot(
      UpdateSnapshotRequest request, StreamObserver<Snapshot> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Snapshot) {
      requests.add(request);
      responseObserver.onNext(((Snapshot) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateSnapshot, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Snapshot.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteSnapshot(
      DeleteSnapshotRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteSnapshot, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void seek(SeekRequest request, StreamObserver<SeekResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof SeekResponse) {
      requests.add(request);
      responseObserver.onNext(((SeekResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method Seek, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  SeekResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
