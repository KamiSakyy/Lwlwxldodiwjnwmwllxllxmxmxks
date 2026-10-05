package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import c21.c0;

/* loaded from: /home/user/work/p/classes.dex */
public final class p extends i {
    public static final Parcelable.Creator<p> CREATOR = new c0(23);

    /* renamed from: r, reason: collision with root package name */
    public final int f22010r;

    public p(Parcel parcel) {
        super(parcel);
        this.f22010r = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f22010r);
    }

    public p(int i) {
        super(AbsSavedState.EMPTY_STATE);
        this.f22010r = i;
    }
}
