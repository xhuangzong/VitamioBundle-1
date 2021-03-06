package u.can.i.up.vitamio_iptv_byr.common;

/**
 * Created by lczgywzyy on 2014/12/19.
 */

public class Variables {

    /** move mode*/
    public static final int MODE_NONE = 0;
    public static final int MODE_DRAG = 1; //拖拽
    public static final int MODE_ZOOM = 2; //缩放
    public static final int MODE_PROGRESS = 3;//播放进度
    public static final int MODE_VOLUME = 4;//音量
    public static final int MODE_BRIGHTNESS = 5;//亮度

    /** video view mode*/
    public static final int VIDEO_NAIVE_WITH_CONTROLLER = 6;
    public static final int VIDEO_NAIVE_WITHOUT_CONTROLLER = 7;
    public static final int VIDEO_CENTER_WITH_CONTROLLER = 8;
    public static final int VIDEO_CENTER_WITHOUT_CONTROLLER = 9;

    /** image view variables*/
    public static final float MIN_ZOOM_SCALE = 0.5f;
    public static final float MAX_ZOOM_SCALE = 5f;
}
