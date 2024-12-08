// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compte.proto

package org.marouanedbibih.grpc.stubs;

public interface SoldeStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SoldeStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Nombre total de comptes
   * </pre>
   *
   * <code>int32 count = 1;</code>
   * @return The count.
   */
  int getCount();

  /**
   * <pre>
   * Somme des soldes
   * </pre>
   *
   * <code>float sum = 2;</code>
   * @return The sum.
   */
  float getSum();

  /**
   * <pre>
   * Moyenne des soldes
   * </pre>
   *
   * <code>float average = 3;</code>
   * @return The average.
   */
  float getAverage();
}
