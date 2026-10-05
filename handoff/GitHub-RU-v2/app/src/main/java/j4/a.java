package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27003a = false;

    /* renamed from: b, reason: collision with root package name */
    public String f27004b;

    /* renamed from: c, reason: collision with root package name */
    public int f27005c;

    /* renamed from: d, reason: collision with root package name */
    public int f27006d;

    /* renamed from: e, reason: collision with root package name */
    public float f27007e;

    /* renamed from: f, reason: collision with root package name */
    public String f27008f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27009g;

    /* renamed from: h, reason: collision with root package name */
    public int f27010h;

    public a(a aVar, Object obj) {
        this.f27004b = aVar.f27004b;
        this.f27005c = aVar.f27005c;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f27179d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z10 = false;
        Object obj = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            int i11 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i11 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i11;
                            }
                        }
                        i = 7;
                    }
                }
                i = i12;
            }
        }
        if (str != null && obj != null) {
            a aVar = new a();
            aVar.f27004b = str;
            aVar.f27005c = i;
            aVar.f27003a = z10;
            aVar.f(obj);
            hashMap.put(str, aVar);
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = (a) hashMap.get(str);
            if (!aVar.f27003a) {
                str = f1.e.g("set", str);
            }
            try {
                int b10 = y3.a.b(aVar.f27005c);
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (b10) {
                    case k5.f.J:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(aVar.f27006d));
                        break;
                    case 1:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(aVar.f27007e));
                        break;
                    case 2:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(aVar.f27010h));
                        break;
                    case 3:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f27010h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(str, CharSequence.class).invoke(view, aVar.f27008f);
                        break;
                    case 5:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f27009g));
                        break;
                    case 6:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(aVar.f27007e));
                        break;
                    case 7:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(aVar.f27006d));
                        break;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    public final float a() {
        switch (y3.a.b(this.f27005c)) {
            case k5.f.J:
                return this.f27006d;
            case 1:
            case 6:
                return this.f27007e;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.f27009g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        switch (y3.a.b(this.f27005c)) {
            case k5.f.J:
                fArr[0] = this.f27006d;
                return;
            case 1:
                fArr[0] = this.f27007e;
                return;
            case 2:
            case 3:
                int i = (this.f27010h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.f27009g ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.f27007e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int b10 = y3.a.b(this.f27005c);
        return (b10 == 2 || b10 == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (y3.a.b(this.f27005c)) {
            case k5.f.J:
            case 7:
                this.f27006d = ((Integer) obj).intValue();
                break;
            case 1:
                this.f27007e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f27010h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f27008f = (String) obj;
                break;
            case 5:
                this.f27009g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f27007e = ((Float) obj).floatValue();
                break;
        }
    }
}
