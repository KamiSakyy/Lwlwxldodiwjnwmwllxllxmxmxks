package b8;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class k extends View.BaseSavedState {
    public static final Parcelable.Creator<k> CREATOR = new a21.g(8);

    /* renamed from: r, reason: collision with root package name */
    public final boolean f3827r;

    public k(Parcelable parcelable, boolean z10) {
        super(parcelable);
        this.f3827r = z10;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f3827r ? (byte) 1 : (byte) 0);
    }

    public k(Parcel parcel) {
        super(parcel);
        this.f3827r = parcel.readByte() != 0;
    }
}
