package com.robinpowered.RNAudioJack;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNAudioJackModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNAudioJackModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAudioJack";
  }
}
