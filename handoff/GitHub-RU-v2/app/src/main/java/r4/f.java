package r4;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public class f extends com.google.common.util.concurrent.a {

    /* renamed from: h, reason: collision with root package name */
    public static Class f31158h = null;
    public static Constructor i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Method f31159j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f31160k = null;
    public static boolean l = false;

    /* renamed from: a, reason: collision with root package name */
    public Class f31161a;

    /* renamed from: b, reason: collision with root package name */
    public Constructor f31162b;

    /* renamed from: c, reason: collision with root package name */
    public Method f31163c;

    /* renamed from: d, reason: collision with root package name */
    public Method f31164d;

    /* renamed from: e, reason: collision with root package name */
    public Method f31165e;

    /* renamed from: f, reason: collision with root package name */
    public Method f31166f;

    /* renamed from: g, reason: collision with root package name */
    public Method f31167g;

    public f() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = h0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = i0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f31161a = cls;
        this.f31162b = constructor;
        this.f31163c = method2;
        this.f31164d = method3;
        this.f31165e = method4;
        this.f31166f = method5;
        this.f31167g = method;
    }

    public static boolean d0(Object obj, String str, int i10, boolean z10) {
        g0();
        try {
            return ((Boolean) f31159j.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static void g0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (l) {
            return;
        }
        l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        i = constructor;
        f31158h = cls;
        f31159j = method2;
        f31160k = method;
    }

    public static Method h0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean c0(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f31163c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface e0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f31161a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f31167g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean f0(Object obj) {
        try {
            return ((Boolean) this.f31165e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method i0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final Typeface k(Context context, q4.e eVar, Resources resources, int i10) {
        Object obj;
        if (this.f31163c != null) {
            try {
                obj = this.f31162b.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                q4.f[] fVarArr = eVar.f30942a;
                int length = fVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        q4.f fVar = fVarArr[i11];
                        Context context2 = context;
                        if (c0(context2, obj, fVar.f30943a, fVar.f30947e, fVar.f30944b, fVar.f30945c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f30946d))) {
                            i11++;
                            context = context2;
                        } else {
                            try {
                                this.f31166f.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (f0(obj)) {
                        return e0(obj);
                    }
                }
            }
            return null;
        }
        g0();
        try {
            Object newInstance = i.newInstance(null);
            for (q4.f fVar2 : eVar.f30942a) {
                File t10 = i21.a.t(context);
                if (t10 == null) {
                    return null;
                }
                try {
                    if (i21.a.m(t10, resources, fVar2.f30948f) && d0(newInstance, t10.getPath(), fVar2.f30944b, fVar2.f30945c)) {
                        t10.delete();
                    }
                } catch (RuntimeException unused3) {
                } catch (Throwable th) {
                    t10.delete();
                    throw th;
                }
                t10.delete();
                return null;
            }
            g0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f31158h, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f31160k.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e5) {
                throw new RuntimeException(e5);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final Typeface l(Context context, x4.h[] hVarArr, int i10) {
        Object obj;
        Typeface e02;
        boolean z10;
        if (hVarArr.length >= 1) {
            try {
                if (this.f31163c != null) {
                    HashMap hashMap = new HashMap();
                    for (x4.h hVar : hVarArr) {
                        if (hVar.f33780f == 0) {
                            Uri uri = hVar.f33775a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, i21.a.B(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f31162b.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = hVarArr.length;
                        int i11 = 0;
                        boolean z11 = false;
                        while (true) {
                            Method method = this.f31166f;
                            if (i11 < length) {
                                x4.h hVar2 = hVarArr[i11];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f33775a);
                                if (byteBuffer != null) {
                                    try {
                                        z10 = ((Boolean) this.f31164d.invoke(obj, byteBuffer, Integer.valueOf(hVar2.f33776b), null, Integer.valueOf(hVar2.f33777c), Integer.valueOf(hVar2.f33778d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        method.invoke(obj, null);
                                        break;
                                    }
                                    z11 = true;
                                }
                                i11++;
                                z11 = z11;
                            } else if (!z11) {
                                method.invoke(obj, null);
                            } else if (f0(obj) && (e02 = e0(obj)) != null) {
                                return Typeface.create(e02, i10);
                            }
                        }
                    }
                } else {
                    x4.h q10 = q(hVarArr, i10);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q10.f33775a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(q10.f33777c).setItalic(q10.f33778d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    public final Typeface n(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        if (this.f31163c == null) {
            return super.n(context, resources, i10, str, i11);
        }
        try {
            obj = this.f31162b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!c0(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f31166f.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (f0(obj)) {
                return e0(obj);
            }
        }
        return null;
    }
}
