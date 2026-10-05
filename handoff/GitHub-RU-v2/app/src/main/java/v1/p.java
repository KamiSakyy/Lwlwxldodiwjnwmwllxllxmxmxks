package v1;

import android.os.Parcel;
import android.os.Parcelable;
import l7.g1;
import q.g3;
import q.q2;

/* loaded from: /home/user/work/p/classes.dex */
public final class p implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32401a;

    public /* synthetic */ p(int i) {
        this.f32401a = i;
    }

    public static q a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = p.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new q();
        }
        n1.f f6 = n1.i.f29393s.f();
        for (int i = 0; i < readInt; i++) {
            f6.add(parcel.readValue(classLoader));
        }
        return new q(f6.d());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f32401a) {
            case k5.f.J:
                return a(parcel, classLoader);
            case 1:
                return new androidx.fragment.app.z(parcel, classLoader);
            case 2:
                return new androidx.viewpager.widget.i(parcel, classLoader);
            case 3:
                return new d31.e(parcel, classLoader);
            case 4:
                return new e31.c(parcel, classLoader);
            case 5:
                if (parcel.readParcelable(classLoader) == null) {
                    return i5.b.f26018s;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                j8.n nVar = new j8.n(parcel, classLoader);
                nVar.f27292r = parcel.readInt();
                nVar.f27293s = parcel.readInt();
                nVar.f27294t = parcel.readParcelable(classLoader);
                return nVar;
            case 7:
                return new l4.g(parcel, classLoader);
            case 8:
                return new g1(parcel, classLoader);
            case 9:
                return new o31.b(parcel, classLoader);
            case 10:
                return new q2(parcel, classLoader);
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new g3(parcel, classLoader);
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                return new v31.c(parcel, classLoader);
            default:
                return new y31.x(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f32401a) {
            case k5.f.J:
                return new q[i];
            case 1:
                return new androidx.fragment.app.z[i];
            case 2:
                return new androidx.viewpager.widget.i[i];
            case 3:
                return new d31.e[i];
            case 4:
                return new e31.c[i];
            case 5:
                return new i5.b[i];
            case 6:
                return new j8.n[i];
            case 7:
                return new l4.g[i];
            case 8:
                return new g1[i];
            case 9:
                return new o31.b[i];
            case 10:
                return new q2[i];
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new g3[i];
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                return new v31.c[i];
            default:
                return new y31.x[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f32401a) {
            case k5.f.J:
                return a(parcel, null);
            case 1:
                return new androidx.fragment.app.z(parcel, null);
            case 2:
                return new androidx.viewpager.widget.i(parcel, null);
            case 3:
                return new d31.e(parcel, (ClassLoader) null);
            case 4:
                return new e31.c(parcel, (ClassLoader) null);
            case 5:
                if (parcel.readParcelable(null) == null) {
                    return i5.b.f26018s;
                }
                throw new IllegalStateException("superState must be null");
            case 6:
                j8.n nVar = new j8.n(parcel, null);
                nVar.f27292r = parcel.readInt();
                nVar.f27293s = parcel.readInt();
                nVar.f27294t = parcel.readParcelable(null);
                return nVar;
            case 7:
                return new l4.g(parcel, null);
            case 8:
                return new g1(parcel, null);
            case 9:
                return new o31.b(parcel, (ClassLoader) null);
            case 10:
                return new q2(parcel, null);
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new g3(parcel, null);
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                return new v31.c(parcel, (ClassLoader) null);
            default:
                return new y31.x(parcel, (ClassLoader) null);
        }
    }
}
