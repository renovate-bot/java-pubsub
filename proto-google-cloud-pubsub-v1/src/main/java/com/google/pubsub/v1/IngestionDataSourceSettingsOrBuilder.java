/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

// Protobuf Java Version: 3.25.3
package com.google.pubsub.v1;

public interface IngestionDataSourceSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.IngestionDataSourceSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Amazon Kinesis Data Streams.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AwsKinesis aws_kinesis = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the awsKinesis field is set.
   */
  boolean hasAwsKinesis();
  /**
   *
   *
   * <pre>
   * Optional. Amazon Kinesis Data Streams.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AwsKinesis aws_kinesis = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The awsKinesis.
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.AwsKinesis getAwsKinesis();
  /**
   *
   *
   * <pre>
   * Optional. Amazon Kinesis Data Streams.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AwsKinesis aws_kinesis = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.AwsKinesisOrBuilder getAwsKinesisOrBuilder();

  com.google.pubsub.v1.IngestionDataSourceSettings.SourceCase getSourceCase();
}
