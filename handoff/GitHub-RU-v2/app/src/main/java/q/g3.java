package q;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public final class g3 extends i5.b {
    public static final Parcelable.Creator<g3> CREATOR = new v1.p(11);

    /* renamed from: t, reason: collision with root package name */
    public int f30589t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30590u;

    public g3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f30589t = parcel.readInt();
        this.f30590u = parcel.readInt() != 0;
    }

    @Override // i5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f30589t);
        parcel.writeInt(this.f30590u ? 1 : 0);
    }
}
