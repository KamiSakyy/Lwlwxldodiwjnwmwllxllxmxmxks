package h;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import gn.m;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new m(14);

    /* renamed from: r, reason: collision with root package name */
    public final int f24874r;

    /* renamed from: s, reason: collision with root package name */
    public final Intent f24875s;

    public a(Intent intent, int i) {
        this.f24874r = i;
        this.f24875s = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f24874r;
        sb2.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb2.append(", data=");
        sb2.append(this.f24875s);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(this.f24874r);
        Intent intent = this.f24875s;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
