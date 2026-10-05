package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import c21.c0;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends i {
    public static final Parcelable.Creator<g> CREATOR = new c0(21);

    /* renamed from: r, reason: collision with root package name */
    public HashSet f22003r;

    public g(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.f22003r = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f22003r, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f22003r.size());
        HashSet hashSet = this.f22003r;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public g() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
