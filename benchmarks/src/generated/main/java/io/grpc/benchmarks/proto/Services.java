// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services.proto

package io.grpc.benchmarks.proto;

public final class Services {
  private Services() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016services.proto\022\014grpc.testing\032\016messages" +
      ".proto\032\rcontrol.proto\032\013stats.proto2\246\003\n\020B" +
      "enchmarkService\022F\n\tUnaryCall\022\033.grpc.test" +
      "ing.SimpleRequest\032\034.grpc.testing.SimpleR" +
      "esponse\022N\n\rStreamingCall\022\033.grpc.testing." +
      "SimpleRequest\032\034.grpc.testing.SimpleRespo" +
      "nse(\0010\001\022R\n\023StreamingFromClient\022\033.grpc.te" +
      "sting.SimpleRequest\032\034.grpc.testing.Simpl" +
      "eResponse(\001\022R\n\023StreamingFromServer\022\033.grp" +
      "c.testing.SimpleRequest\032\034.grpc.testing.S",
      "impleResponse0\001\022R\n\021StreamingBothWays\022\033.g" +
      "rpc.testing.SimpleRequest\032\034.grpc.testing" +
      ".SimpleResponse(\0010\0012\227\002\n\rWorkerService\022E\n" +
      "\tRunServer\022\030.grpc.testing.ServerArgs\032\032.g" +
      "rpc.testing.ServerStatus(\0010\001\022E\n\tRunClien" +
      "t\022\030.grpc.testing.ClientArgs\032\032.grpc.testi" +
      "ng.ClientStatus(\0010\001\022B\n\tCoreCount\022\031.grpc." +
      "testing.CoreRequest\032\032.grpc.testing.CoreR" +
      "esponse\0224\n\nQuitWorker\022\022.grpc.testing.Voi" +
      "d\032\022.grpc.testing.Void2^\n\030ReportQpsScenar",
      "ioService\022B\n\016ReportScenario\022\034.grpc.testi" +
      "ng.ScenarioResult\032\022.grpc.testing.VoidB$\n" +
      "\030io.grpc.benchmarks.protoB\010Servicesb\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grpc.benchmarks.proto.Messages.getDescriptor(),
          io.grpc.benchmarks.proto.Control.getDescriptor(),
          io.grpc.benchmarks.proto.Stats.getDescriptor(),
        }, assigner);
    io.grpc.benchmarks.proto.Messages.getDescriptor();
    io.grpc.benchmarks.proto.Control.getDescriptor();
    io.grpc.benchmarks.proto.Stats.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
