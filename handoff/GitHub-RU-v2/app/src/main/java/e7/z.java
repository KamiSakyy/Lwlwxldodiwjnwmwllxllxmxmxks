package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import c21.c0;

/* loaded from: /home/user/work/p/classes.dex */
public final class z extends i {
    public static final Parcelable.Creator<z> CREATOR = new c0(24);

    /* renamed from: r, reason: collision with root package name */
    public int f22054r;

    /* renamed from: s, reason: collision with root package name */
    public int f22055s;

    /* renamed from: t, reason: collision with root package name */
    public int f22056t;

    public z(Parcel parcel) {
        super(parcel);
        this.f22054r = parcel.readInt();
        this.f22055s = parcel.readInt();
        this.f22056t = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f22054r);
        parcel.writeInt(this.f22055s);
        parcel.writeInt(this.f22056t);
    }

    public z() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
