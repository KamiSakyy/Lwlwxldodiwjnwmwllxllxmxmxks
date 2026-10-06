package y31;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x extends i5.b {
    public static final Parcelable.Creator<x> CREATOR = new v1.p(13);
    public CharSequence t;
    public boolean u;

    public x(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.u = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.t) + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.t, parcel, i);
        parcel.writeInt(this.u ? 1 : 0);
    }
    public x(android.os.Parcelable p1) {
    }
}
