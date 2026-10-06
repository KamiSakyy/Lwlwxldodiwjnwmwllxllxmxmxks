package com.github.rudroid.settings.preferences;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f0;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import com.github.rudroid.fragments.BaseComposeBottomSheetDialog;
import com.github.rudroid.fragments.g0;
import d2.a0;
import d2.l0;
import java.util.ArrayList;
import k71.k;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SingleChoiceBottomSheet extends BaseComposeBottomSheetDialog {
    public static final a Companion = new a();

    public static final class a {
        public static SingleChoiceBottomSheet a(String str, String str2, ArrayList arrayList, String str3) {
            k.g(str2, "selectedValue");
            Bundle bundle = new Bundle();
            bundle.putString("key_sheet_title", str);
            bundle.putString("key_selected_value", str2);
            bundle.putParcelableArrayList("key_items", arrayList);
            bundle.putString("key_request_key", str3);
            SingleChoiceBottomSheet singleChoiceBottomSheet = new SingleChoiceBottomSheet();
            singleChoiceBottomSheet.n4(bundle);
            return singleChoiceBottomSheet;
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final String r;
        public final String s;

        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                k.g(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(String str, String str2) {
            k.g(str, "value");
            k.g(str2, "title");
            this.r = str;
            this.s = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k.b(this.r, bVar.r) && k.b(this.s, bVar.s);
        }

        public final int hashCode() {
            return this.s.hashCode() + (this.r.hashCode() * 31);
        }

        public final String toString() {
            return x.i.g("SingleChoiceItem(value=", this.r, ", title=", this.s, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            k.g(parcel, "dest");
            parcel.writeString(this.r);
            parcel.writeString(this.s);
        }
    }

    public static void H4(SingleChoiceBottomSheet singleChoiceBottomSheet, boolean z, f0 f0Var, s sVar, int i) {
        Bundle bundle;
        ArrayList parcelableArrayList;
        Bundle bundle2;
        k.g(f0Var, "$this$PrimaryBottomSheetContent");
        if (!sVar.S(i & 1, (i & 17) != 16)) {
            sVar.V();
            return;
        }
        long j = ih.d.b(sVar).d;
        o oVar = o.a;
        l0 l0Var = a0.b;
        r a2 = p2.f.a(f0.o.w(f0.o.f(oVar, j, l0Var), f0.o.v(sVar), true), w2.f0.A(sVar), (p2.d) null);
        e0 a3 = c0.a(l.c, w1.c.D, sVar, 0);
        int hashCode = Long.hashCode(sVar.T);
        v1 l = sVar.l();
        r c = w1.a.c(sVar, a2);
        v2.h.o.getClass();
        v2.f fVar = v2.g.b;
        sVar.g0();
        if (sVar.S) {
            sVar.k(fVar);
        } else {
            sVar.q0();
        }
        t.I(sVar, v2.g.f, a3);
        t.I(sVar, v2.g.e, l);
        t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
        t.E(sVar, v2.g.h);
        t.I(sVar, v2.g.d, c);
        sVar.c0(-2145274130);
        int i2 = Build.VERSION.SDK_INT;
        ArrayList<b> arrayList = x61.r.r;
        if (i2 < 33 ? !((bundle = ((androidx.fragment.app.a0) singleChoiceBottomSheet).x) == null || (parcelableArrayList = bundle.getParcelableArrayList("key_items")) == null) : !((bundle2 = ((androidx.fragment.app.a0) singleChoiceBottomSheet).x) == null || (parcelableArrayList = bundle2.getParcelableArrayList("key_items", b.class)) == null)) {
            arrayList = parcelableArrayList;
        }
        for (b bVar : arrayList) {
            r y = androidx.compose.foundation.layout.b.y(oVar, ih.a.p, ih.a.n);
            Bundle bundle3 = ((androidx.fragment.app.a0) singleChoiceBottomSheet).x;
            String string = bundle3 != null ? bundle3.getString("key_selected_value") : null;
            if (string == null) {
                string = "";
            }
            boolean equals = string.equals(bVar.r);
            boolean h = sVar.h(singleChoiceBottomSheet) | sVar.h(bVar);
            Object N = sVar.N();
            if (h || N == n.a) {
                N = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(21, singleChoiceBottomSheet, bVar);
                sVar.n0(N);
            }
            gh.i.a(y, equals, (j71.a) N, false, r1.i.d(-175579083, new b1(23, bVar), sVar), sVar, 24576, 8);
        }
        sVar.q(false);
        if (z) {
            sVar.c0(-2084075254);
        } else {
            sVar.c0(-2077908672);
            androidx.compose.foundation.layout.b.g(sVar, f0.o.f(p2.e(p2.f(oVar, 64), 1.0f), ih.d.b(sVar).d, l0Var));
        }
        sVar.q(false);
        sVar.q(true);
    }

    public final g0 D4() {
        g0.Companion.getClass();
        return g0.c(g0.u);
    }

    public final r1.d E4() {
        return new r1.d(new h(this, 0), true, -992792757);
    }


    public static  n4(Object... a) {
        return null;
    }
}
