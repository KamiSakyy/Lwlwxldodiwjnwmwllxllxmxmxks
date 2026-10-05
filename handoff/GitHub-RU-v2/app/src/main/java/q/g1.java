package q;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f30583a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f30584b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f30585c;

    /* renamed from: d, reason: collision with root package name */
    public static final Field f30586d;

    /* renamed from: e, reason: collision with root package name */
    public static final Field f30587e;

    /* renamed from: f, reason: collision with root package name */
    public static final Field f30588f;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z10;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
        } catch (ClassNotFoundException unused) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused2) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused3) {
            method = null;
            field = null;
        }
        try {
            field = cls.getField("left");
            try {
                field2 = cls.getField("top");
                try {
                    field3 = cls.getField("right");
                    try {
                        field4 = cls.getField("bottom");
                        z10 = true;
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused4) {
                        field4 = null;
                        z10 = false;
                        if (z10) {
                        }
                    }
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                    field3 = null;
                }
            } catch (ClassNotFoundException unused6) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                }
            } catch (NoSuchFieldException unused7) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                }
            } catch (NoSuchMethodException unused8) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z10 = false;
            if (z10) {
            }
        } catch (NoSuchFieldException unused10) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z10 = false;
            if (z10) {
            }
        } catch (NoSuchMethodException unused11) {
            field = null;
            field2 = field;
            field3 = field2;
            field4 = null;
            z10 = false;
            if (z10) {
            }
        }
        if (z10) {
            f30584b = null;
            f30585c = null;
            f30586d = null;
            f30587e = null;
            f30588f = null;
            f30583a = false;
            return;
        }
        f30584b = method;
        f30585c = field;
        f30586d = field2;
        f30587e = field3;
        f30588f = field4;
        f30583a = true;
    }
}
