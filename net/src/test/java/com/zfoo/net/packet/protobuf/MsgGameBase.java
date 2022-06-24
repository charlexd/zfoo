// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg_game_base.proto

package com.zfoo.net.packet.protobuf;

public final class MsgGameBase {
  private MsgGameBase() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * 游戏状态
   * </pre>
   *
   * Protobuf enum {@code CK.EGameState}
   */
  public enum EGameState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *主界面
     * </pre>
     *
     * <code>GameState_None = 0;</code>
     */
    GameState_None(0),
    /**
     * <pre>
     *加载中
     * </pre>
     *
     * <code>GameState_Loading = 1;</code>
     */
    GameState_Loading(1),
    /**
     * <pre>
     *主界面
     * </pre>
     *
     * <code>GameState_MainUI = 2;</code>
     */
    GameState_MainUI(2),
    /**
     * <pre>
     *单人游戏
     * </pre>
     *
     * <code>GameState_SinglePlayer = 3;</code>
     */
    GameState_SinglePlayer(3),
    /**
     * <pre>
     *多人游戏
     * </pre>
     *
     * <code>GameState_MultiPlayer = 4;</code>
     */
    GameState_MultiPlayer(4),
    ;

    /**
     * <pre>
     *主界面
     * </pre>
     *
     * <code>GameState_None = 0;</code>
     */
    public static final int GameState_None_VALUE = 0;
    /**
     * <pre>
     *加载中
     * </pre>
     *
     * <code>GameState_Loading = 1;</code>
     */
    public static final int GameState_Loading_VALUE = 1;
    /**
     * <pre>
     *主界面
     * </pre>
     *
     * <code>GameState_MainUI = 2;</code>
     */
    public static final int GameState_MainUI_VALUE = 2;
    /**
     * <pre>
     *单人游戏
     * </pre>
     *
     * <code>GameState_SinglePlayer = 3;</code>
     */
    public static final int GameState_SinglePlayer_VALUE = 3;
    /**
     * <pre>
     *多人游戏
     * </pre>
     *
     * <code>GameState_MultiPlayer = 4;</code>
     */
    public static final int GameState_MultiPlayer_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EGameState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EGameState forNumber(int value) {
      switch (value) {
        case 0: return GameState_None;
        case 1: return GameState_Loading;
        case 2: return GameState_MainUI;
        case 3: return GameState_SinglePlayer;
        case 4: return GameState_MultiPlayer;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EGameState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EGameState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EGameState>() {
            public EGameState findValueByNumber(int number) {
              return EGameState.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.zfoo.net.packet.protobuf.MsgGameBase.getDescriptor().getEnumTypes().get(0);
    }

    private static final EGameState[] VALUES = values();

    public static EGameState valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EGameState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CK.EGameState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023msg_game_base.proto\022\002CK\032\022message_base." +
      "proto*\204\001\n\nEGameState\022\022\n\016GameState_None\020\000" +
      "\022\025\n\021GameState_Loading\020\001\022\024\n\020GameState_Mai" +
      "nUI\020\002\022\032\n\026GameState_SinglePlayer\020\003\022\031\n\025Gam" +
      "eState_MultiPlayer\020\004B \n\034com.zfoo.net.pac" +
      "ket.protobufH\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.zfoo.net.packet.protobuf.MessageBase.getDescriptor(),
        });
    com.zfoo.net.packet.protobuf.MessageBase.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
