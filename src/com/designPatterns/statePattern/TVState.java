package com.designPatterns.statePattern;

/**
 * Created by gongtuo on 2017/5/31.
 */
public interface TVState {
    /*
    上一个频道
     */
public void prevChannel();
    /*
    下一个频道
     */
public void nextChannel();
    /*
    音量+
     */
    public void turnUp();
    /*
    音量-
     */
    public void turnDown();
}
