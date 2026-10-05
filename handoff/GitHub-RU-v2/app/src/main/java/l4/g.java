package l4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import v1.p;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends i5.b {
    public static final Parcelable.Creator<g> CREATOR = new p(7);

    /* renamed from: t, reason: collision with root package name */
    public SparseArray f28015t;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f28015t = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f28015t.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // i5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f28015t;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f28015t.keyAt(i10);
            parcelableArr[i10] = (Parcelable) this.f28015t.valueAt(i10);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
