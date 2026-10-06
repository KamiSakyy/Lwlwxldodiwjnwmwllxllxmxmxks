package l7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.service.agents.AgentAssignment;
import com.github.service.license.LicenseTemplate;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.github.service.models.response.type.MilestoneState;
import com.github.service.models.response.type.PatchStatus;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import yz0.i5;
import yz0.n5;

/* loaded from: /home/user/work/p/classes.dex */
public final class c0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28075a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        boolean z11;
        boolean z12;
        n5 n5Var;
        boolean z13;
        boolean z14;
        boolean z15;
        switch (this.f28075a) {
            case k5.f.J /* 0 */:
                d0 d0Var = new d0();
                d0Var.f28083r = parcel.readInt();
                d0Var.f28084s = parcel.readInt();
                d0Var.f28085t = parcel.readInt() == 1;
                return d0Var;
            case 1:
                w1 w1Var = new w1();
                w1Var.f28323r = parcel.readInt();
                w1Var.f28324s = parcel.readInt();
                w1Var.f28326u = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    w1Var.f28325t = iArr;
                    parcel.readIntArray(iArr);
                }
                return w1Var;
            case 2:
                y1 y1Var = new y1();
                y1Var.f28364r = parcel.readInt();
                y1Var.f28365s = parcel.readInt();
                int readInt2 = parcel.readInt();
                y1Var.f28366t = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    y1Var.f28367u = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                y1Var.f28368v = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    y1Var.f28369w = iArr3;
                    parcel.readIntArray(iArr3);
                }
                y1Var.f28371y = parcel.readInt() == 1;
                y1Var.f28372z = parcel.readInt() == 1;
                y1Var.A = parcel.readInt() == 1;
                y1Var.f28370x = parcel.readArrayList(w1.class.getClassLoader());
                return y1Var;
            case 3:
                k71.k.g(parcel, "parcel");
                return new AgentAssignment(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                k71.k.g(parcel, "parcel");
                return new on.l(parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                k71.k.g(parcel, "parcel");
                String readString = parcel.readString();
                com.github.service.models.response.a aVar = (com.github.service.models.response.a) com.github.service.models.response.a.CREATOR.createFromParcel(parcel);
                boolean z16 = false;
                if (parcel.readInt() != 0) {
                    z10 = false;
                    z16 = true;
                    z11 = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
                String readString2 = parcel.readString();
                boolean z17 = z11;
                int readInt4 = parcel.readInt();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt5 = parcel.readInt();
                n5 readParcelable = parcel.readParcelable(p01.n.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z12 = z17;
                    n5Var = readParcelable;
                    z13 = z12;
                } else {
                    z12 = z17;
                    n5Var = readParcelable;
                    z13 = z10;
                }
                String readString5 = parcel.readString();
                boolean z18 = z12;
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z18 = z10;
                }
                return new p01.n(readString, aVar, z16, readString2, readInt4, readString3, readString4, readInt5, n5Var, z13, readString5, readString6, z18, parcel.readString());
            case 6:
                String readString7 = parcel.readString();
                k71.k.d(readString7);
                int readInt6 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt6);
                for (int i = 0; i < readInt6; i++) {
                    String readString8 = parcel.readString();
                    k71.k.d(readString8);
                    String readString9 = parcel.readString();
                    k71.k.d(readString9);
                    linkedHashMap.put(readString8, readString9);
                }
                return new p9.a(readString7, linkedHashMap);
            case 7:
                q.l0 l0Var = new q.l0(parcel);
                l0Var.f30648r = parcel.readByte() != 0;
                return l0Var;
            case 8:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return ShortcutScope.AllRepositories.INSTANCE;
            case 9:
                k71.k.g(parcel, "parcel");
                return new ShortcutScope.SpecificRepository(parcel.readString(), parcel.readString());
            case 10:
                k71.k.g(parcel, "parcel");
                return PatchStatus.valueOf(parcel.readString());
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                k71.k.g(parcel, "parcel");
                return new LicenseTemplate(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                int b02 = k41.b.b0(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < b02) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        k41.b.N(parcel, readInt7);
                    } else {
                        bundle = k41.b.m(parcel, readInt7);
                    }
                }
                k41.b.s(parcel, b02);
                return new w51.q(bundle);
            case 13:
                k71.k.g(parcel, "parcel");
                return new wl0.f(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                k71.k.g(parcel, "parcel");
                return new wl0.g(parcel.readString(), parcel.readString(), MilestoneState.valueOf(parcel.readString()), parcel.readInt(), (ZonedDateTime) parcel.readSerializable());
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                k71.k.g(parcel, "parcel");
                int readInt8 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt8);
                int i10 = 0;
                int i11 = 0;
                while (i11 != readInt8) {
                    i11 = f1.e.b(wl0.j.class, parcel, arrayList, i11, 1);
                }
                int readInt9 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt9);
                int i12 = 0;
                while (i12 != readInt9) {
                    i12 = f1.e.b(wl0.j.class, parcel, arrayList2, i12, 1);
                }
                i5 readParcelable2 = parcel.readParcelable(wl0.j.class.getClassLoader());
                boolean z19 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z14 = z19;
                    z15 = true;
                } else {
                    z14 = z19;
                    z15 = false;
                }
                String readString10 = parcel.readString();
                int readInt10 = parcel.readInt();
                boolean z20 = z14;
                ArrayList arrayList3 = new ArrayList(readInt10);
                while (i10 != readInt10) {
                    i10 = f1.e.b(wl0.j.class, parcel, arrayList3, i10, 1);
                }
                return new wl0.j(arrayList, arrayList2, readParcelable2, z20, z15, readString10, arrayList3);
            case 16:
                k71.k.g(parcel, "parcel");
                String readString11 = parcel.readString();
                int readInt11 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt11);
                int i13 = 0;
                while (i13 != readInt11) {
                    i13 = f1.e.b(ShortcutConfigurationModel.class, parcel, arrayList4, i13, 1);
                }
                return new ShortcutConfigurationModel(readString11, arrayList4, ShortcutColor.valueOf(parcel.readString()), ShortcutIcon.valueOf(parcel.readString()), parcel.readParcelable(ShortcutConfigurationModel.class.getClassLoader()), ShortcutType.valueOf(parcel.readString()), parcel.readString());
            case 17:
                k71.k.g(parcel, "parcel");
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                int readInt12 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt12);
                int i14 = 0;
                while (i14 != readInt12) {
                    i14 = f1.e.b(StoredShortcutModel.class, parcel, arrayList5, i14, 1);
                }
                return new StoredShortcutModel(ShortcutColor.valueOf(parcel.readString()), ShortcutIcon.valueOf(parcel.readString()), parcel.readParcelable(StoredShortcutModel.class.getClassLoader()), ShortcutType.valueOf(parcel.readString()), readString12, readString13, readString14, arrayList5);
            case 18:
                k71.k.g(parcel, "parcel");
                return new xn.g(parcel.readDouble(), parcel.readInt() != 0);
            case 19:
                k71.k.g(parcel, "parcel");
                return new xn.h(xn.i.valueOf(parcel.readString()), parcel.readString());
            case 20:
                k71.k.g(parcel, "parcel");
                return new xn.k(xn.l.valueOf(parcel.readString()), parcel.readString());
            case 21:
                k71.k.g(parcel, "parcel");
                return new xn.m(parcel.readInt() != 0);
            case 22:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return xn.n.s;
            case 23:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return xn.o.s;
            case 24:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return xn.q.s;
            case 25:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return xn.r.s;
            case 26:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return xn.s.s;
            case 27:
                k71.k.g(parcel, "parcel");
                return new xn.t(parcel.readString());
            case 28:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return xn.u.s;
            default:
                k71.k.g(parcel, "parcel");
                return new xn.h0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f28075a) {
            case k5.f.J /* 0 */:
                return new d0[i];
            case 1:
                return new w1[i];
            case 2:
                return new y1[i];
            case 3:
                return new AgentAssignment[i];
            case 4:
                return new on.l[i];
            case 5:
                return new p01.n[i];
            case 6:
                return new p9.a[i];
            case 7:
                return new q.l0[i];
            case 8:
                return new ShortcutScope.AllRepositories[i];
            case 9:
                return new ShortcutScope.SpecificRepository[i];
            case 10:
                return new PatchStatus[i];
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new LicenseTemplate[i];
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                return new w51.q[i];
            case 13:
                return new wl0.f[i];
            case 14:
                return new wl0.g[i];
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                return new wl0.j[i];
            case 16:
                return new ShortcutConfigurationModel[i];
            case 17:
                return new StoredShortcutModel[i];
            case 18:
                return new xn.g[i];
            case 19:
                return new xn.h[i];
            case 20:
                return new xn.k[i];
            case 21:
                return new xn.m[i];
            case 22:
                return new xn.n[i];
            case 23:
                return new xn.o[i];
            case 24:
                return new xn.q[i];
            case 25:
                return new xn.r[i];
            case 26:
                return new xn.s[i];
            case 27:
                return new xn.t[i];
            case 28:
                return new xn.u[i];
            default:
                return new xn.h0[i];
        }
    }
    public c0(int p1) {
    }
}
