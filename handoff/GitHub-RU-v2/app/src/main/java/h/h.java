package h;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import gn.m;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m(15);

    /* renamed from: r, reason: collision with root package name */
    public IntentSender f24888r;

    /* renamed from: s, reason: collision with root package name */
    public Intent f24889s;

    /* renamed from: t, reason: collision with root package name */
    public int f24890t;

    /* renamed from: u, reason: collision with root package name */
    public int f24891u;

    public h(IntentSender intentSender, Intent intent, int i, int i10) {
        k.g(intentSender, "intentSender");
        this.f24888r = intentSender;
        this.f24889s = intent;
        this.f24890t = i;
        this.f24891u = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.f24888r, i);
        parcel.writeParcelable(this.f24889s, i);
        parcel.writeInt(this.f24890t);
        parcel.writeInt(this.f24891u);
    }
}
