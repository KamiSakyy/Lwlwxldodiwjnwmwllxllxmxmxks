package q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class l0 extends View.BaseSavedState {
    public static final Parcelable.Creator<l0> CREATOR = new l7.c0(7);

    /* renamed from: r, reason: collision with root package name */
    public boolean f30648r;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f30648r ? (byte) 1 : (byte) 0);
    }
}
