package d31;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import v1.p;

/* loaded from: /home/user/work/p/classes4.dex */
public class e extends i5.b {
    public static final Parcelable.Creator<e> CREATOR = new p(3);
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt() == 1;
        this.w = parcel.readInt() == 1;
        this.x = parcel.readInt() == 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.t = bottomSheetBehavior.O;
        this.u = bottomSheetBehavior.f;
        this.v = bottomSheetBehavior.b;
        this.w = bottomSheetBehavior.J;
        this.x = bottomSheetBehavior.K;
    }
}
