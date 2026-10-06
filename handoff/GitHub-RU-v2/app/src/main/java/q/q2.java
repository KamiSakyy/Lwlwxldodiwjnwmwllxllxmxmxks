package q;

import android.os.Parcel;
import android.os.Parcelable;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes.dex */
public final class q2 extends i5.b {
    public static final Parcelable.Creator<q2> CREATOR = new v1.p(10);

    /* renamed from: t, reason: collision with root package name */
    public boolean f30695t;

    public q2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f30695t = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" isIconified=");
        return f4Shadow.s(sb2, this.f30695t, "}");
    }

    @Override // i5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f30695t));
    }
}
