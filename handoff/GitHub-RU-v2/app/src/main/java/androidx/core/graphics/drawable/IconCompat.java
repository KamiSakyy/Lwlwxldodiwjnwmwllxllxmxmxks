package androidx.core.graphics.drawable;

import a5.l;
import a5.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import k5.f;

/* loaded from: /home/user/work/p/classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2226k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f2227a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2228b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2229c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f2230d;

    /* renamed from: e, reason: collision with root package name */
    public int f2231e;

    /* renamed from: f, reason: collision with root package name */
    public int f2232f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2233g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2234h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f2235j;

    public IconCompat() {
        this.f2227a = -1;
        this.f2229c = null;
        this.f2230d = null;
        this.f2231e = 0;
        this.f2232f = 0;
        this.f2233g = null;
        this.f2234h = f2226k;
        this.i = null;
    }

    public static IconCompat a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2231e = i;
        iconCompat.f2228b = "";
        iconCompat.f2235j = "";
        return iconCompat;
    }

    public final int b() {
        int i = this.f2227a;
        if (i != -1) {
            if (i == 2) {
                return this.f2231e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f2228b;
        if (i10 >= 28) {
            return l.k(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public final int c() {
        int i = this.f2227a;
        if (i != -1) {
            return i;
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f2228b;
        if (i10 >= 28) {
            return l.r(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    public final Uri d() {
        int i = this.f2227a;
        if (i == -1) {
            int i10 = Build.VERSION.SDK_INT;
            Object obj = this.f2228b;
            if (i10 >= 28) {
                return l.s(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f2228b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final Icon e(Context context) {

        Object r2 = null;
        Icon createWithBitmap;
        int i = Build.VERSION.SDK_INT;
        int i10 = this.f2227a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        switch (i10) {
            case -1:
                return (Icon) this.f2228b;
            case f.J:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f2228b);
                break;
            case 2:
                if (i10 == -1) {
                    Object obj = this.f2228b;
                    if (i >= 28) {
                        str = l.l(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str2 = this.f2235j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.f2228b).split(":", -1)[0] : this.f2235j;
                }
                createWithBitmap = Icon.createWithResource(str, this.f2231e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f2228b, this.f2231e, this.f2232f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f2228b);
                break;
            case 5:
                createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f2228b);
                break;
            case 6:
                if (i >= 30) {
                    createWithBitmap = m.a(d());
                    break;
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + d());
                    }
                    Uri d10 = d();
                    String scheme = d10.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(d10);
                        } catch (Exception unused2) {
                            d10.toString();
                        }
                    } else {
                        try {
                            openInputStream = new FileInputStream(new File((String) this.f2228b));
                        } catch (FileNotFoundException unused3) {
                            d10.toString();
                        }
                    }
                    if (openInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + d());
                    }
                    createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(openInputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = this.f2233g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f2234h;
        if (mode != f2226k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f2227a == -1) {
            return String.valueOf(this.f2228b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f2227a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f2227a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f2228b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f2228b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f2235j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f2231e);
                if (this.f2232f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f2232f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f2228b);
                break;
        }
        if (this.f2233g != null) {
            sb2.append(" tint=");
            sb2.append(this.f2233g);
        }
        if (this.f2234h != f2226k) {
            sb2.append(" mode=");
            sb2.append(this.f2234h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i) {
        this.f2229c = null;
        this.f2230d = null;
        this.f2231e = 0;
        this.f2232f = 0;
        this.f2233g = null;
        this.f2234h = f2226k;
        this.i = null;
        this.f2227a = i;
    }
}
