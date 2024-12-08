package org.marouanedbibih.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Définition du service correspondant aux requêtes et mutations GraphQL
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: compte.proto")
public final class CompteServiceGrpc {

  private CompteServiceGrpc() {}

  public static final String SERVICE_NAME = "CompteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.GetAllComptesREQ,
      org.marouanedbibih.grpc.stubs.GetAllComptesRES> getAllComptesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllComptes",
      requestType = org.marouanedbibih.grpc.stubs.GetAllComptesREQ.class,
      responseType = org.marouanedbibih.grpc.stubs.GetAllComptesRES.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.GetAllComptesREQ,
      org.marouanedbibih.grpc.stubs.GetAllComptesRES> getAllComptesMethod() {
    io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.GetAllComptesREQ, org.marouanedbibih.grpc.stubs.GetAllComptesRES> getAllComptesMethod;
    if ((getAllComptesMethod = CompteServiceGrpc.getAllComptesMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getAllComptesMethod = CompteServiceGrpc.getAllComptesMethod) == null) {
          CompteServiceGrpc.getAllComptesMethod = getAllComptesMethod = 
              io.grpc.MethodDescriptor.<org.marouanedbibih.grpc.stubs.GetAllComptesREQ, org.marouanedbibih.grpc.stubs.GetAllComptesRES>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "AllComptes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.GetAllComptesREQ.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.GetAllComptesRES.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("AllComptes"))
                  .build();
          }
        }
     }
     return getAllComptesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.GetCompteByIdREQ,
      org.marouanedbibih.grpc.stubs.GetCompteByIdRES> getCompteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CompteById",
      requestType = org.marouanedbibih.grpc.stubs.GetCompteByIdREQ.class,
      responseType = org.marouanedbibih.grpc.stubs.GetCompteByIdRES.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.GetCompteByIdREQ,
      org.marouanedbibih.grpc.stubs.GetCompteByIdRES> getCompteByIdMethod() {
    io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.GetCompteByIdREQ, org.marouanedbibih.grpc.stubs.GetCompteByIdRES> getCompteByIdMethod;
    if ((getCompteByIdMethod = CompteServiceGrpc.getCompteByIdMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getCompteByIdMethod = CompteServiceGrpc.getCompteByIdMethod) == null) {
          CompteServiceGrpc.getCompteByIdMethod = getCompteByIdMethod = 
              io.grpc.MethodDescriptor.<org.marouanedbibih.grpc.stubs.GetCompteByIdREQ, org.marouanedbibih.grpc.stubs.GetCompteByIdRES>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "CompteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.GetCompteByIdREQ.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.GetCompteByIdRES.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("CompteById"))
                  .build();
          }
        }
     }
     return getCompteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ,
      org.marouanedbibih.grpc.stubs.GetTotalSoldeRES> getTotalSoldeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TotalSolde",
      requestType = org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ.class,
      responseType = org.marouanedbibih.grpc.stubs.GetTotalSoldeRES.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ,
      org.marouanedbibih.grpc.stubs.GetTotalSoldeRES> getTotalSoldeMethod() {
    io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ, org.marouanedbibih.grpc.stubs.GetTotalSoldeRES> getTotalSoldeMethod;
    if ((getTotalSoldeMethod = CompteServiceGrpc.getTotalSoldeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getTotalSoldeMethod = CompteServiceGrpc.getTotalSoldeMethod) == null) {
          CompteServiceGrpc.getTotalSoldeMethod = getTotalSoldeMethod = 
              io.grpc.MethodDescriptor.<org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ, org.marouanedbibih.grpc.stubs.GetTotalSoldeRES>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "TotalSolde"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.GetTotalSoldeRES.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("TotalSolde"))
                  .build();
          }
        }
     }
     return getTotalSoldeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.SaveCompteREQ,
      org.marouanedbibih.grpc.stubs.SaveCompteRES> getSaveCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveCompte",
      requestType = org.marouanedbibih.grpc.stubs.SaveCompteREQ.class,
      responseType = org.marouanedbibih.grpc.stubs.SaveCompteRES.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.SaveCompteREQ,
      org.marouanedbibih.grpc.stubs.SaveCompteRES> getSaveCompteMethod() {
    io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.SaveCompteREQ, org.marouanedbibih.grpc.stubs.SaveCompteRES> getSaveCompteMethod;
    if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
          CompteServiceGrpc.getSaveCompteMethod = getSaveCompteMethod = 
              io.grpc.MethodDescriptor.<org.marouanedbibih.grpc.stubs.SaveCompteREQ, org.marouanedbibih.grpc.stubs.SaveCompteRES>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "SaveCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.SaveCompteREQ.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.SaveCompteRES.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("SaveCompte"))
                  .build();
          }
        }
     }
     return getSaveCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.UpdateCompteREQ,
      org.marouanedbibih.grpc.stubs.UpdateCompteRES> getUpdateCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCompte",
      requestType = org.marouanedbibih.grpc.stubs.UpdateCompteREQ.class,
      responseType = org.marouanedbibih.grpc.stubs.UpdateCompteRES.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.UpdateCompteREQ,
      org.marouanedbibih.grpc.stubs.UpdateCompteRES> getUpdateCompteMethod() {
    io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.UpdateCompteREQ, org.marouanedbibih.grpc.stubs.UpdateCompteRES> getUpdateCompteMethod;
    if ((getUpdateCompteMethod = CompteServiceGrpc.getUpdateCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getUpdateCompteMethod = CompteServiceGrpc.getUpdateCompteMethod) == null) {
          CompteServiceGrpc.getUpdateCompteMethod = getUpdateCompteMethod = 
              io.grpc.MethodDescriptor.<org.marouanedbibih.grpc.stubs.UpdateCompteREQ, org.marouanedbibih.grpc.stubs.UpdateCompteRES>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "UpdateCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.UpdateCompteREQ.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.UpdateCompteRES.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("UpdateCompte"))
                  .build();
          }
        }
     }
     return getUpdateCompteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.DeleteCompteREQ,
      com.google.protobuf.Empty> getDeleteCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCompte",
      requestType = org.marouanedbibih.grpc.stubs.DeleteCompteREQ.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.DeleteCompteREQ,
      com.google.protobuf.Empty> getDeleteCompteMethod() {
    io.grpc.MethodDescriptor<org.marouanedbibih.grpc.stubs.DeleteCompteREQ, com.google.protobuf.Empty> getDeleteCompteMethod;
    if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getDeleteCompteMethod = CompteServiceGrpc.getDeleteCompteMethod) == null) {
          CompteServiceGrpc.getDeleteCompteMethod = getDeleteCompteMethod = 
              io.grpc.MethodDescriptor.<org.marouanedbibih.grpc.stubs.DeleteCompteREQ, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "DeleteCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.marouanedbibih.grpc.stubs.DeleteCompteREQ.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("DeleteCompte"))
                  .build();
          }
        }
     }
     return getDeleteCompteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompteServiceStub newStub(io.grpc.Channel channel) {
    return new CompteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompteServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static abstract class CompteServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public void allComptes(org.marouanedbibih.grpc.stubs.GetAllComptesREQ request,
        io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.GetAllComptesRES> responseObserver) {
      asyncUnimplementedUnaryCall(getAllComptesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public void compteById(org.marouanedbibih.grpc.stubs.GetCompteByIdREQ request,
        io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.GetCompteByIdRES> responseObserver) {
      asyncUnimplementedUnaryCall(getCompteByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public void totalSolde(org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ request,
        io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.GetTotalSoldeRES> responseObserver) {
      asyncUnimplementedUnaryCall(getTotalSoldeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public void saveCompte(org.marouanedbibih.grpc.stubs.SaveCompteREQ request,
        io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.SaveCompteRES> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCompteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update Compte
     * </pre>
     */
    public void updateCompte(org.marouanedbibih.grpc.stubs.UpdateCompteREQ request,
        io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.UpdateCompteRES> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCompteMethod(), responseObserver);
    }

    /**
     */
    public void deleteCompte(org.marouanedbibih.grpc.stubs.DeleteCompteREQ request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCompteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllComptesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.marouanedbibih.grpc.stubs.GetAllComptesREQ,
                org.marouanedbibih.grpc.stubs.GetAllComptesRES>(
                  this, METHODID_ALL_COMPTES)))
          .addMethod(
            getCompteByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.marouanedbibih.grpc.stubs.GetCompteByIdREQ,
                org.marouanedbibih.grpc.stubs.GetCompteByIdRES>(
                  this, METHODID_COMPTE_BY_ID)))
          .addMethod(
            getTotalSoldeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ,
                org.marouanedbibih.grpc.stubs.GetTotalSoldeRES>(
                  this, METHODID_TOTAL_SOLDE)))
          .addMethod(
            getSaveCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.marouanedbibih.grpc.stubs.SaveCompteREQ,
                org.marouanedbibih.grpc.stubs.SaveCompteRES>(
                  this, METHODID_SAVE_COMPTE)))
          .addMethod(
            getUpdateCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.marouanedbibih.grpc.stubs.UpdateCompteREQ,
                org.marouanedbibih.grpc.stubs.UpdateCompteRES>(
                  this, METHODID_UPDATE_COMPTE)))
          .addMethod(
            getDeleteCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.marouanedbibih.grpc.stubs.DeleteCompteREQ,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_COMPTE)))
          .build();
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceStub extends io.grpc.stub.AbstractStub<CompteServiceStub> {
    private CompteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public void allComptes(org.marouanedbibih.grpc.stubs.GetAllComptesREQ request,
        io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.GetAllComptesRES> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllComptesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public void compteById(org.marouanedbibih.grpc.stubs.GetCompteByIdREQ request,
        io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.GetCompteByIdRES> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public void totalSolde(org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ request,
        io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.GetTotalSoldeRES> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTotalSoldeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public void saveCompte(org.marouanedbibih.grpc.stubs.SaveCompteREQ request,
        io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.SaveCompteRES> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update Compte
     * </pre>
     */
    public void updateCompte(org.marouanedbibih.grpc.stubs.UpdateCompteREQ request,
        io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.UpdateCompteRES> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCompteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCompte(org.marouanedbibih.grpc.stubs.DeleteCompteREQ request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceBlockingStub extends io.grpc.stub.AbstractStub<CompteServiceBlockingStub> {
    private CompteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public org.marouanedbibih.grpc.stubs.GetAllComptesRES allComptes(org.marouanedbibih.grpc.stubs.GetAllComptesREQ request) {
      return blockingUnaryCall(
          getChannel(), getAllComptesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public org.marouanedbibih.grpc.stubs.GetCompteByIdRES compteById(org.marouanedbibih.grpc.stubs.GetCompteByIdREQ request) {
      return blockingUnaryCall(
          getChannel(), getCompteByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public org.marouanedbibih.grpc.stubs.GetTotalSoldeRES totalSolde(org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ request) {
      return blockingUnaryCall(
          getChannel(), getTotalSoldeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public org.marouanedbibih.grpc.stubs.SaveCompteRES saveCompte(org.marouanedbibih.grpc.stubs.SaveCompteREQ request) {
      return blockingUnaryCall(
          getChannel(), getSaveCompteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update Compte
     * </pre>
     */
    public org.marouanedbibih.grpc.stubs.UpdateCompteRES updateCompte(org.marouanedbibih.grpc.stubs.UpdateCompteREQ request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCompteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCompte(org.marouanedbibih.grpc.stubs.DeleteCompteREQ request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCompteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Définition du service correspondant aux requêtes et mutations GraphQL
   * </pre>
   */
  public static final class CompteServiceFutureStub extends io.grpc.stub.AbstractStub<CompteServiceFutureStub> {
    private CompteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Équivalent de la requête allComptes
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.marouanedbibih.grpc.stubs.GetAllComptesRES> allComptes(
        org.marouanedbibih.grpc.stubs.GetAllComptesREQ request) {
      return futureUnaryCall(
          getChannel().newCall(getAllComptesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la requête compteById
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.marouanedbibih.grpc.stubs.GetCompteByIdRES> compteById(
        org.marouanedbibih.grpc.stubs.GetCompteByIdREQ request) {
      return futureUnaryCall(
          getChannel().newCall(getCompteByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la requête totalSolde
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.marouanedbibih.grpc.stubs.GetTotalSoldeRES> totalSolde(
        org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ request) {
      return futureUnaryCall(
          getChannel().newCall(getTotalSoldeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Équivalent de la mutation saveCompte
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.marouanedbibih.grpc.stubs.SaveCompteRES> saveCompte(
        org.marouanedbibih.grpc.stubs.SaveCompteREQ request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update Compte
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.marouanedbibih.grpc.stubs.UpdateCompteRES> updateCompte(
        org.marouanedbibih.grpc.stubs.UpdateCompteREQ request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCompteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCompte(
        org.marouanedbibih.grpc.stubs.DeleteCompteREQ request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCompteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_COMPTES = 0;
  private static final int METHODID_COMPTE_BY_ID = 1;
  private static final int METHODID_TOTAL_SOLDE = 2;
  private static final int METHODID_SAVE_COMPTE = 3;
  private static final int METHODID_UPDATE_COMPTE = 4;
  private static final int METHODID_DELETE_COMPTE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_COMPTES:
          serviceImpl.allComptes((org.marouanedbibih.grpc.stubs.GetAllComptesREQ) request,
              (io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.GetAllComptesRES>) responseObserver);
          break;
        case METHODID_COMPTE_BY_ID:
          serviceImpl.compteById((org.marouanedbibih.grpc.stubs.GetCompteByIdREQ) request,
              (io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.GetCompteByIdRES>) responseObserver);
          break;
        case METHODID_TOTAL_SOLDE:
          serviceImpl.totalSolde((org.marouanedbibih.grpc.stubs.GetTotalSoldeREQ) request,
              (io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.GetTotalSoldeRES>) responseObserver);
          break;
        case METHODID_SAVE_COMPTE:
          serviceImpl.saveCompte((org.marouanedbibih.grpc.stubs.SaveCompteREQ) request,
              (io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.SaveCompteRES>) responseObserver);
          break;
        case METHODID_UPDATE_COMPTE:
          serviceImpl.updateCompte((org.marouanedbibih.grpc.stubs.UpdateCompteREQ) request,
              (io.grpc.stub.StreamObserver<org.marouanedbibih.grpc.stubs.UpdateCompteRES>) responseObserver);
          break;
        case METHODID_DELETE_COMPTE:
          serviceImpl.deleteCompte((org.marouanedbibih.grpc.stubs.DeleteCompteREQ) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.marouanedbibih.grpc.stubs.CompteOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompteService");
    }
  }

  private static final class CompteServiceFileDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier {
    CompteServiceFileDescriptorSupplier() {}
  }

  private static final class CompteServiceMethodDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompteServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CompteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompteServiceFileDescriptorSupplier())
              .addMethod(getAllComptesMethod())
              .addMethod(getCompteByIdMethod())
              .addMethod(getTotalSoldeMethod())
              .addMethod(getSaveCompteMethod())
              .addMethod(getUpdateCompteMethod())
              .addMethod(getDeleteCompteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
