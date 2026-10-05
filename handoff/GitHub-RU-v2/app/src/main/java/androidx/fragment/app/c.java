package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a21.g(4);

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f2511r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f2512s;

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f2511r = arrayList;
        this.f2512s = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f2511r);
        parcel.writeTypedList(this.f2512s);
    }

    public c(Parcel parcel) {
        this.f2511r = parcel.createStringArrayList();
        this.f2512s = parcel.createTypedArrayList(b.CREATOR);
    }
}
