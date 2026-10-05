package j8;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import v1.p;

/* loaded from: /home/user/work/p/classes.dex */
public final class n extends View.BaseSavedState {
    public static final Parcelable.Creator<n> CREATOR = new p(6);

    /* renamed from: r, reason: collision with root package name */
    public int f27292r;

    /* renamed from: s, reason: collision with root package name */
    public int f27293s;

    /* renamed from: t, reason: collision with root package name */
    public Parcelable f27294t;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f27292r);
        parcel.writeInt(this.f27293s);
        parcel.writeParcelable(this.f27294t, i);
    }
}
