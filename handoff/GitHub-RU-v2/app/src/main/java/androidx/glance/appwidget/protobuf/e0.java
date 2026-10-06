package androidx.glance.appwidget.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2705a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2706b;

    static {
        Charset.forName("US-ASCII");
        f2705a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2706b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static Object b;
}
