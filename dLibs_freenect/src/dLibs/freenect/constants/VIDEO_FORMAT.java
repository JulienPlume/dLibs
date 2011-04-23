package dLibs.freenect.constants;

import dLibs.freenect.interfaces.FrameFormat;

public enum VIDEO_FORMAT implements FrameFormat{
  _RGB_             ( 0, VIDEO_FORMAT.FRAME_W_,    VIDEO_FORMAT.FRAME_H_,    3, true  ),    
  _BAYER_           ( 1, VIDEO_FORMAT.FRAME_W_,    VIDEO_FORMAT.FRAME_H_,    1, true  ),      
  _IR_8BIT_         ( 2, VIDEO_FORMAT.IR_FRAME_W_, VIDEO_FORMAT.IR_FRAME_H_, 1, false ),      
  _IR_10BIT_        ( 3, VIDEO_FORMAT.IR_FRAME_W_, VIDEO_FORMAT.IR_FRAME_H_, 2, false ),  
  _YUV_RGB_         ( 5, VIDEO_FORMAT.FRAME_W_,    VIDEO_FORMAT.FRAME_H_,    3, true  ),   
  _YUV_RAW_         ( 6, VIDEO_FORMAT.FRAME_W_,    VIDEO_FORMAT.FRAME_H_,    2, true  ), 
  
  ;
  private static final int FRAME_W_      = 640;
  private static final int FRAME_H_      = 480;

  private static final int IR_FRAME_W_   = 640;
  private static final int IR_FRAME_H_   = 488;
  private final int     value_;
  private final int     buffer_;
  private final int     width_;
  private final int     height_;
  private final int     bytes_per_pixel_;
  private final boolean color_mapping_;
  private VIDEO_FORMAT(int value, int width, int height, int bytes_per_pixel, boolean color_mapping) {
    this.value_           = value;
    this.width_           = width;
    this.height_          = height;
    this.bytes_per_pixel_ = bytes_per_pixel;
    this.color_mapping_   = color_mapping;
    this.buffer_ = this.width_*this.height_*this.bytes_per_pixel_;
  }
  public final int getValue(){
    return this.value_;
  }
  public final int getBufferSize(){
    return this.buffer_;
  }
  public final int getWidth(){
    return this.width_;
  }
  public final int getHeight(){
    return this.height_;
  }
  public final int getBytesPerPixel(){
    return this.bytes_per_pixel_;
  }
  public final boolean colorMapping(){
    return this.color_mapping_;
  }
}
