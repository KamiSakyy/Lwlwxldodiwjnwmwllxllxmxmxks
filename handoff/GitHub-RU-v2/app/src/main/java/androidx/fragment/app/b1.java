package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class b1 implements Parcelable {
    public static final Parcelable.Creator<b1> CREATOR = new a21.g(6);

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2503r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f2504s;

    /* renamed from: t, reason: collision with root package name */
    public b[] f2505t;

    /* renamed from: u, reason: collision with root package name */
    public int f2506u;

    /* renamed from: v, reason: collision with root package name */
    public String f2507v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f2508w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f2509x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f2510y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f2503r);
        parcel.writeStringList(this.f2504s);
        parcel.writeTypedArray(this.f2505t, i);
        parcel.writeInt(this.f2506u);
        parcel.writeString(this.f2507v);
        parcel.writeStringList(this.f2508w);
        parcel.writeTypedList(this.f2509x);
        parcel.writeTypedList(this.f2510y);
    }
}
