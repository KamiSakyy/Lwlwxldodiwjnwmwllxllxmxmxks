package e31;

import android.os.Parcel;
import android.os.Parcelable;
import v1.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends i5.b {
    public static final Parcelable.Creator<c> CREATOR = new p(4);
    public boolean t;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c.class.getClassLoader();
        }
        this.t = parcel.readInt() == 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.t ? 1 : 0);
    }
    public c(Object p1) {
    }
}
