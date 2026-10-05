package q4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.foundation.lazy.layout.o1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f30934a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f30935b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f30936c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f30937d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f30938e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f30939f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f30940g;

    public static int b(int i, int i10, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i10;
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!e(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = c.f30941a;
        try {
            return c.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public static o1 d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        o1 o1Var;
        if (e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new o1((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                o1Var = o1.e(typedArray.getResourceId(i, 0), theme, typedArray.getResources());
            } catch (Exception unused) {
                o1Var = null;
            }
            if (o1Var != null) {
                return o1Var;
            }
        }
        return new o1((Shader) null, (ColorStateList) null, 0);
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int f(float f6) {
        if (f6 < 1.0f) {
            return -16777216;
        }
        if (f6 > 99.0f) {
            return -1;
        }
        float f10 = (f6 + 16.0f) / 116.0f;
        float f11 = f6 > 8.0f ? f10 * f10 * f10 : f6 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z10 = f12 > 0.008856452f;
        float f13 = z10 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f30936c;
        return r4.a.a(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    public static float g(int i) {
        float f6 = i / 255.0f;
        return (f6 <= 0.04045f ? f6 / 12.92f : (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [android.content.res.TypedArray] */
    public static d k(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        ArrayList arrayList;
        int i10;
        String str;
        String str2;
        List list;
        Object r42;
        long j10;
        Throwable th;
        TypedArray typedArray;
        boolean isTerminated;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), m4.a.f28915b);
        int i11 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i12 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), m4.a.f28916c);
                        int i13 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z10 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i14 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i15 = obtainAttributes2.getInt(i14, 0);
                        int i16 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i16, 0);
                        String string7 = obtainAttributes2.getString(i16);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m(xmlResourceParser);
                        }
                        arrayList2.add(new f(i13, i15, resourceId2, string7, string6, z10));
                    } else {
                        m(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new e((f[]) arrayList2.toArray(new f[0]));
        }
        List l = l(resources, resourceId);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != i12) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), m4.a.f28917d);
                    int i17 = integer;
                    try {
                        String string8 = obtainAttributes3.getString(i11);
                        String string9 = obtainAttributes3.getString(1);
                        try {
                            String string10 = obtainAttributes3.getString(i);
                            if (string8 == null) {
                                r42 = obtainAttributes3;
                                j10 = 1;
                                throw new XmlPullParserException("query attribute must be set in fallback element");
                            }
                            while (xmlResourceParser.next() != 3) {
                                try {
                                    m(xmlResourceParser);
                                } catch (Throwable th2) {
                                    th = th2;
                                    typedArray = obtainAttributes3;
                                    j10 = 1;
                                }
                            }
                            list = l;
                            r42 = obtainAttributes3;
                            arrayList = arrayList3;
                            str = string3;
                            str2 = string4;
                            i10 = i17;
                            j10 = 1;
                            try {
                                x4.c cVar = new x4.c(string, string2, string8, string9, string10, list);
                                if (r42 instanceof AutoCloseable) {
                                    ((AutoCloseable) r42).close();
                                } else if (r42 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r42;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z11 = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                            } catch (InterruptedException unused) {
                                                if (!z11) {
                                                    executorService.shutdownNow();
                                                    z11 = true;
                                                }
                                            }
                                        }
                                        if (z11) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r42.recycle();
                                }
                                arrayList.add(cVar);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            th = th3;
                        } catch (Throwable th4) {
                            th = th4;
                            r42 = obtainAttributes3;
                            j10 = 1;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r42 = obtainAttributes3;
                        j10 = 1;
                    }
                    th = th;
                    typedArray = r42;
                    if (typedArray == null) {
                        throw th;
                    }
                    try {
                        if (typedArray instanceof AutoCloseable) {
                            typedArray.close();
                            throw th;
                        }
                        if (!(typedArray instanceof ExecutorService)) {
                            typedArray.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) typedArray;
                        if (executorService2 == ForkJoinPool.commonPool()) {
                            throw th;
                        }
                        boolean isTerminated2 = executorService2.isTerminated();
                        if (isTerminated2) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z12 = false;
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService2.awaitTermination(j10, TimeUnit.DAYS);
                            } catch (InterruptedException unused2) {
                                if (!z12) {
                                    executorService2.shutdownNow();
                                    z12 = true;
                                }
                            }
                        }
                        if (!z12) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                arrayList = arrayList3;
                i10 = integer;
                str = string3;
                str2 = string4;
                list = l;
                m(xmlResourceParser);
                arrayList3 = arrayList;
                l = list;
                string3 = str;
                string4 = str2;
                i = 2;
                i12 = 3;
                integer = i10;
                i11 = 0;
            }
        }
        ArrayList arrayList4 = arrayList3;
        int i18 = integer;
        String str3 = string3;
        String str4 = string4;
        List list2 = l;
        if (!arrayList4.isEmpty()) {
            return new g(i18, integer2, string5, arrayList4);
        }
        if (str3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList4.add(new x4.c(string, string2, str3, null, null, list2));
        if (str4 != null) {
            arrayList4.add(new x4.c(string, string2, str4, null, null, list2));
        }
        return new g(i18, integer2, string5, arrayList4);
    }

    public static List l(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void m(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static float n() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new b1.c(this, i, 3));
    }

    public abstract void i(int i);

    public abstract void j(Typeface typeface);
}
