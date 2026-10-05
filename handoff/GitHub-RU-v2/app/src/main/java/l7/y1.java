package l7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class y1 implements Parcelable {
    public static final Parcelable.Creator<y1> CREATOR = new c0(2);
    public boolean A;

    /* renamed from: r, reason: collision with root package name */
    public int f28364r;

    /* renamed from: s, reason: collision with root package name */
    public int f28365s;

    /* renamed from: t, reason: collision with root package name */
    public int f28366t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f28367u;

    /* renamed from: v, reason: collision with root package name */
    public int f28368v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f28369w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f28370x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28371y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f28372z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28364r);
        parcel.writeInt(this.f28365s);
        parcel.writeInt(this.f28366t);
        if (this.f28366t > 0) {
            parcel.writeIntArray(this.f28367u);
        }
        parcel.writeInt(this.f28368v);
        if (this.f28368v > 0) {
            parcel.writeIntArray(this.f28369w);
        }
        parcel.writeInt(this.f28371y ? 1 : 0);
        parcel.writeInt(this.f28372z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeList(this.f28370x);
    }
}
