package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import c21.c0;

/* loaded from: /home/user/work/p/classes.dex */
public class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new c0(20);

    /* renamed from: r, reason: collision with root package name */
    public String f22000r;

    public e(Parcel parcel) {
        super(parcel);
        this.f22000r = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f22000r);
    }

    public e() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
