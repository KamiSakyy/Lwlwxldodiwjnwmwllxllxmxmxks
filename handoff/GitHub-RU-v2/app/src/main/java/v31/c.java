package v31;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import v1.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends i5.b {
    public static final Parcelable.Creator<c> CREATOR = new p(12);
    public final int t;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.t = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.t);
    }

    public c(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.t = sideSheetBehavior.h;
    }
}
