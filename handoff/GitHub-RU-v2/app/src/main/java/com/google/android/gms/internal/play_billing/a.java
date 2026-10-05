package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends com.google.android.gms.internal.measurement.x implements c {
    public final int P(int i, String str, String str2, Bundle bundle) {
        Parcel N = N();
        N.writeInt(i);
        N.writeString(str);
        N.writeString(str2);
        int i2 = d.a;
        N.writeInt(1);
        bundle.writeToParcel(N, 0);
        Parcel O = O(N, 10);
        int readInt = O.readInt();
        O.recycle();
        return readInt;
    }

    public final Bundle Q(String str, String str2, Bundle bundle) {
        Parcel N = N();
        N.writeInt(9);
        N.writeString(str);
        N.writeString(str2);
        int i = d.a;
        N.writeInt(1);
        bundle.writeToParcel(N, 0);
        Parcel O = O(N, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(O);
        O.recycle();
        return bundle2;
    }

    public final Bundle R(String str, String str2, String str3) {
        Parcel N = N();
        N.writeInt(3);
        N.writeString(str);
        N.writeString(str2);
        N.writeString(str3);
        N.writeString(null);
        Parcel O = O(N, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(O);
        O.recycle();
        return bundle;
    }

    public final Bundle S(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel N = N();
        N.writeInt(i);
        N.writeString(str);
        N.writeString(str2);
        N.writeString(str3);
        N.writeString(null);
        int i2 = d.a;
        N.writeInt(1);
        bundle.writeToParcel(N, 0);
        Parcel O = O(N, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(O);
        O.recycle();
        return bundle2;
    }

    public final Bundle T(String str, String str2) {
        Parcel N = N();
        N.writeInt(3);
        N.writeString(str);
        N.writeString("subs");
        N.writeString(str2);
        Parcel O = O(N, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(O);
        O.recycle();
        return bundle;
    }

    public final Bundle U(int i, String str, String str2, Bundle bundle) {
        Parcel N = N();
        N.writeInt(i);
        N.writeString(str);
        N.writeString("subs");
        N.writeString(str2);
        int i2 = d.a;
        N.writeInt(1);
        bundle.writeToParcel(N, 0);
        Parcel O = O(N, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(O);
        O.recycle();
        return bundle2;
    }

    public final Bundle V(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel N = N();
        N.writeInt(i);
        N.writeString(str);
        N.writeString(str2);
        int i2 = d.a;
        N.writeInt(1);
        bundle.writeToParcel(N, 0);
        N.writeInt(1);
        bundle2.writeToParcel(N, 0);
        Parcel O = O(N, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) d.a(O);
        O.recycle();
        return bundle3;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a<T1,T2,T3,T4> {
        public a() {
        }
    }
}
