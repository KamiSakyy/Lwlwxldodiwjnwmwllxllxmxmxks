package j4;

import android.R;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f27176a = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, 2130968633, 2130968636, 2130968689, 2130968690, 2130968691, 2130968771, 2130968917, 2130968918, 2130969035, 2130969166, 2130969167, 2130969168, 2130969169, 2130969170, 2130969171, 2130969172, 2130969173, 2130969174, 2130969175, 2130969176, 2130969177, 2130969178, 2130969180, 2130969181, 2130969182, 2130969183, 2130969184, 2130969219, 2130969345, 2130969346, 2130969347, 2130969348, 2130969349, 2130969350, 2130969351, 2130969352, 2130969353, 2130969354, 2130969355, 2130969356, 2130969357, 2130969358, 2130969359, 2130969360, 2130969361, 2130969362, 2130969363, 2130969364, 2130969365, 2130969366, 2130969367, 2130969368, 2130969369, 2130969370, 2130969371, 2130969372, 2130969373, 2130969374, 2130969375, 2130969376, 2130969377, 2130969378, 2130969379, 2130969380, 2130969381, 2130969382, 2130969383, 2130969384, 2130969385, 2130969386, 2130969387, 2130969388, 2130969389, 2130969390, 2130969392, 2130969393, 2130969394, 2130969395, 2130969396, 2130969397, 2130969398, 2130969399, 2130969400, 2130969403, 2130969408, 2130969568, 2130969575, 2130969627, 2130969636, 2130969642, 2130969672, 2130969673, 2130969674, 2130970055, 2130970058, 2130970060, 2130970081};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f27177b = {R.attr.orientation, R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_margin, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.paddingStart, R.attr.paddingEnd, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.elevation, R.attr.layout_marginHorizontal, R.attr.layout_marginVertical, 2130968689, 2130968690, 2130968691, 2130968771, 2130968811, 2130968812, 2130968813, 2130968814, 2130968815, 2130968914, 2130968917, 2130968918, 2130969166, 2130969167, 2130969168, 2130969169, 2130969170, 2130969171, 2130969172, 2130969173, 2130969174, 2130969175, 2130969176, 2130969177, 2130969178, 2130969180, 2130969181, 2130969182, 2130969183, 2130969184, 2130969219, 2130969337, 2130969345, 2130969346, 2130969347, 2130969348, 2130969349, 2130969350, 2130969351, 2130969352, 2130969353, 2130969354, 2130969355, 2130969356, 2130969357, 2130969358, 2130969359, 2130969360, 2130969361, 2130969362, 2130969363, 2130969364, 2130969365, 2130969366, 2130969367, 2130969368, 2130969369, 2130969370, 2130969371, 2130969372, 2130969373, 2130969374, 2130969375, 2130969376, 2130969377, 2130969378, 2130969379, 2130969380, 2130969381, 2130969382, 2130969383, 2130969384, 2130969385, 2130969386, 2130969387, 2130969388, 2130969389, 2130969390, 2130969392, 2130969393, 2130969394, 2130969395, 2130969396, 2130969397, 2130969398, 2130969399, 2130969400, 2130969403, 2130969404, 2130969408};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f27178c = {R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, 2130968633, 2130968636, 2130968689, 2130968690, 2130968691, 2130968771, 2130968917, 2130969035, 2130969166, 2130969167, 2130969168, 2130969169, 2130969170, 2130969171, 2130969172, 2130969173, 2130969174, 2130969175, 2130969176, 2130969177, 2130969178, 2130969180, 2130969181, 2130969182, 2130969183, 2130969184, 2130969219, 2130969345, 2130969346, 2130969347, 2130969351, 2130969355, 2130969356, 2130969357, 2130969360, 2130969361, 2130969362, 2130969363, 2130969364, 2130969365, 2130969366, 2130969367, 2130969368, 2130969369, 2130969370, 2130969371, 2130969374, 2130969379, 2130969380, 2130969383, 2130969384, 2130969385, 2130969386, 2130969387, 2130969388, 2130969389, 2130969390, 2130969392, 2130969393, 2130969394, 2130969395, 2130969396, 2130969397, 2130969398, 2130969399, 2130969400, 2130969403, 2130969408, 2130969568, 2130969575, 2130969576, 2130969627, 2130969636, 2130969642, 2130969672, 2130969673, 2130969674, 2130970055, 2130970058, 2130970060, 2130970081};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f27179d = {2130968647, 2130968981, 2130968982, 2130968983, 2130968984, 2130968985, 2130968986, 2130968988, 2130968989, 2130968990, 2130969514};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f27180e = {R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, 2130968980, 2130969202, 2130969568, 2130969576, 2130970055, 2130970058, 2130970060};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f27181f = {R.attr.alpha, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, 2130968980, 2130969202, 2130969568, 2130969576, 2130970058, 2130970060, 2130970086, 2130970087, 2130970088, 2130970089, 2130970091};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f27182g = {2130968980, 2130969035, 2130969202, 2130969321, 2130969576, 2130969627, 2130969630, 2130969631, 2130969632, 2130969633, 2130969770, 2130970058};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f27183h = {R.attr.alpha, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, 2130968980, 2130969202, 2130969568, 2130969576, 2130970058, 2130970060, 2130970085, 2130970086, 2130970087, 2130970088, 2130970089};
    public static final int[] i = {2130969202, 2130969576, 2130969577, 2130969578, 2130969596, 2130969598, 2130969599, 2130970062, 2130970063, 2130970064, 2130970078, 2130970079, 2130970080};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f27184j = {R.attr.orientation, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.layout_marginStart, R.attr.layout_marginEnd, 2130968689, 2130968690, 2130968691, 2130968771, 2130968917, 2130968918, 2130969219, 2130969345, 2130969346, 2130969347, 2130969348, 2130969349, 2130969350, 2130969351, 2130969352, 2130969353, 2130969354, 2130969355, 2130969356, 2130969357, 2130969358, 2130969359, 2130969360, 2130969361, 2130969362, 2130969363, 2130969364, 2130969365, 2130969366, 2130969367, 2130969368, 2130969369, 2130969370, 2130969371, 2130969372, 2130969373, 2130969374, 2130969375, 2130969376, 2130969377, 2130969378, 2130969380, 2130969381, 2130969382, 2130969383, 2130969384, 2130969385, 2130969386, 2130969387, 2130969388, 2130969389, 2130969390, 2130969392, 2130969393, 2130969394, 2130969395, 2130969396, 2130969397, 2130969398, 2130969399, 2130969400, 2130969403, 2130969408, 2130969502, 2130969507, 2130969517, 2130969521};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f27185k = {2130968633, 2130968636, 2130969035, 2130969567, 2130969575, 2130969627, 2130969672, 2130969673, 2130969674, 2130970058};
    public static final int[] l = {2130968640, 2130968977, 2130969337, 2130969528, 2130969568, 2130969755};
    public static final int[] m = {2130968998, 2130969338};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f27186n = {2130968818, 2130969884};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f27187o = {2130968649, 2130969030, 2130969033, 2130969034, 2130969412, 2130969497, 2130969506, 2130969579, 2130969589, 2130969602, 2130969697, 2130969790, 2130969791, 2130969792, 2130969793, 2130969794, 2130970028, 2130970029, 2130970030};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f27188p = {R.attr.visibility, R.attr.alpha, 2130969379, 2130969568, 2130970081};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f27189q = {R.attr.id, 2130968919};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f27190r = {2130969003};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f27191s = {R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, 2130970055};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f27192t = {R.attr.id, 2130968657, 2130968915, 2130968916, 2130969052, 2130969338, 2130969565, 2130969627, 2130969798, 2130970057, 2130970059};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f27193u = {2130968919, 2130969689, 2130969690, 2130969691, 2130969692};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f27194v = {R.attr.id, 2130968576, 2130968577, 2130968817, 2130969052, 2130969258, 2130969259, 2130969565, 2130969576, 2130969601, 2130969627, 2130969723, 2130970057, 2130970066, 2130970077};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f27195w = {2130968914};
}
