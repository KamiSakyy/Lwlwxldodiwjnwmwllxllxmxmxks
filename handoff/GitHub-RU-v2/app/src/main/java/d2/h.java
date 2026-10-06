package d2;

import android.graphics.Paint;

/* loaded from: /home/user/work/p/classes.dex */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21343a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f21344b;

    static {
        try {
            new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        int[] iArr = new int[Paint.Cap.values().length];
        try {
            iArr[Paint.Cap.BUTT.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Paint.Cap.ROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Paint.Cap.SQUARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f21343a = iArr;
        int[] iArr2 = new int[Paint.Join.values().length];
        try {
            iArr2[Paint.Join.MITER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Paint.Join.BEVEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Paint.Join.ROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f21344b = iArr2;
    }

    public static Object a;

    public static Object b;
}
