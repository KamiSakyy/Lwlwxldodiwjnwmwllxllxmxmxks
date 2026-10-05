package l01;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.projects.ProjectFieldOption$Iteration;
import com.github.service.models.response.projects.ProjectFieldOption$SingleOption;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2IterationField;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2SingleSelectField;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2TextField;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2UnknownField;
import com.github.service.models.response.projects.ProjectViewLayoutType;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import yz0.n2;
import yz0.v2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.a) {
            case 0:
                k71.k.g(parcel, "parcel");
                return new d(parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readString());
            case 1:
                k71.k.g(parcel, "parcel");
                return new com.github.service.models.response.projects.a(parcel.readString(), ProjectFieldOption$Iteration.CREATOR.createFromParcel(parcel), parcel.readString());
            case 2:
                k71.k.g(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = f1.e.b(f.class, parcel, arrayList, i, 1);
                }
                return new f(readString, arrayList);
            case 3:
                k71.k.g(parcel, "parcel");
                return new g(parcel.readString(), (v2) parcel.readParcelable(g.class.getClassLoader()));
            case 4:
                k71.k.g(parcel, "parcel");
                return new i(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
            case 5:
                k71.k.g(parcel, "parcel");
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(n2.CREATOR.createFromParcel(parcel));
                }
                return new j(readString2, arrayList2);
            case 6:
                k71.k.g(parcel, "parcel");
                return new k(parcel.readString(), parcel.readString());
            case 7:
                k71.k.g(parcel, "parcel");
                String readString3 = parcel.readString();
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList3.add(f0.CREATOR.createFromParcel(parcel));
                }
                return new l(readString3, arrayList3);
            case 8:
                k71.k.g(parcel, "parcel");
                return new com.github.service.models.response.projects.b(parcel.readString(), ProjectFieldOption$SingleOption.CREATOR.createFromParcel(parcel), parcel.readString());
            case 9:
                k71.k.g(parcel, "parcel");
                return new o(parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                k71.k.g(parcel, "parcel");
                return new p(parcel.readString());
            case 11:
                k71.k.g(parcel, "parcel");
                String readString4 = parcel.readString();
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = f1.e.b(q.class, parcel, arrayList4, i4, 1);
                }
                return new q(readString4, arrayList4);
            case 12:
                k71.k.g(parcel, "parcel");
                return new s(p0.CREATOR.createFromParcel(parcel), t0.CREATOR.createFromParcel(parcel));
            case 13:
                k71.k.g(parcel, "parcel");
                String readString5 = parcel.readString();
                k71.k.g(readString5, "id");
                return new y(readString5);
            case 14:
                k71.k.g(parcel, "parcel");
                return new ProjectFieldOption$Iteration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (LocalDate) parcel.readSerializable());
            case 15:
                k71.k.g(parcel, "parcel");
                return new ProjectFieldOption$SingleOption(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                k71.k.g(parcel, "parcel");
                return new e0(parcel.readString(), parcel.readString(), Avatar.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 17:
                k71.k.g(parcel, "parcel");
                return new f0(parcel.readString(), parcel.readString());
            case 18:
                k71.k.g(parcel, "parcel");
                String readString6 = parcel.readString();
                int readInt5 = parcel.readInt();
                String readString7 = parcel.readString();
                ProjectFieldType valueOf = ProjectFieldType.valueOf(parcel.readString());
                int readInt6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt6);
                for (int i5 = 0; i5 != readInt6; i5++) {
                    arrayList5.add(ProjectFieldOption$Iteration.CREATOR.createFromParcel(parcel));
                }
                int readInt7 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt7);
                for (int i6 = 0; i6 != readInt7; i6++) {
                    arrayList6.add(ProjectFieldOption$Iteration.CREATOR.createFromParcel(parcel));
                }
                return new ProjectV2Field$ProjectV2IterationField(readString6, readInt5, readString7, valueOf, arrayList5, arrayList6, parcel.readInt());
            case 19:
                k71.k.g(parcel, "parcel");
                String readString8 = parcel.readString();
                int readInt8 = parcel.readInt();
                String readString9 = parcel.readString();
                ProjectFieldType valueOf2 = ProjectFieldType.valueOf(parcel.readString());
                int readInt9 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt9);
                for (int i7 = 0; i7 != readInt9; i7++) {
                    arrayList7.add(ProjectFieldOption$SingleOption.CREATOR.createFromParcel(parcel));
                }
                return new ProjectV2Field$ProjectV2SingleSelectField(readString8, readInt8, readString9, valueOf2, arrayList7);
            case 20:
                k71.k.g(parcel, "parcel");
                return new ProjectV2Field$ProjectV2TextField(parcel.readString(), parcel.readInt(), parcel.readString(), ProjectFieldType.valueOf(parcel.readString()));
            case 21:
                k71.k.g(parcel, "parcel");
                return new ProjectV2Field$ProjectV2UnknownField(parcel.readString(), parcel.readInt(), parcel.readString(), ProjectFieldType.valueOf(parcel.readString()));
            case 22:
                k71.k.g(parcel, "parcel");
                String readString10 = parcel.readString();
                int readInt10 = parcel.readInt();
                String readString11 = parcel.readString();
                ProjectViewLayoutType valueOf3 = ProjectViewLayoutType.valueOf(parcel.readString());
                int readInt11 = parcel.readInt();
                int readInt12 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt12);
                int i8 = 0;
                while (i8 != readInt12) {
                    i8 = f1.e.b(l0.class, parcel, arrayList8, i8, 1);
                }
                int readInt13 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt13);
                for (int i9 = 0; i9 != readInt13; i9++) {
                    linkedHashSet.add(parcel.readString());
                }
                int readInt14 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt14);
                for (int i10 = 0; i10 != readInt14; i10++) {
                    linkedHashSet2.add(ProjectFieldType.valueOf(parcel.readString()));
                }
                return new l0(readString10, readInt10, readString11, valueOf3, readInt11, arrayList8, linkedHashSet, linkedHashSet2);
            case 23:
                k71.k.g(parcel, "parcel");
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                e0 createFromParcel = e0.CREATOR.createFromParcel(parcel);
                int readInt15 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt15);
                for (int i12 = 0; i12 != readInt15; i12++) {
                    linkedHashMap.put(y.CREATOR.createFromParcel(parcel), parcel.readParcelable(p0.class.getClassLoader()));
                }
                return new p0(readString12, readString13, z4, createFromParcel, linkedHashMap);
            case 24:
                k71.k.g(parcel, "parcel");
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
                String readString16 = parcel.readString();
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z5 = false;
                }
                int readInt16 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt16);
                for (int i13 = 0; i13 != readInt16; i13++) {
                    linkedHashMap2.put(y.CREATOR.createFromParcel(parcel), parcel.readParcelable(t0.class.getClassLoader()));
                }
                return new t0(readString14, readString15, zonedDateTime, readString16, z5, linkedHashMap2, parcel.readInt() != 0 ? z : false, parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? z : false);
            case 25:
                k71.k.g(parcel, "parcel");
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                j0 j0Var = (j0) parcel.readParcelable(ProjectsMetaInfo.class.getClassLoader());
                int readInt17 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt17);
                int i14 = 0;
                while (i14 != readInt17) {
                    i14 = f1.e.b(ProjectsMetaInfo.class, parcel, arrayList9, i14, 1);
                }
                return new ProjectsMetaInfo(readString17, readString18, readString19, j0Var, arrayList9);
            default:
                k71.k.g(parcel, "parcel");
                String readString20 = parcel.readString();
                int readInt18 = parcel.readInt();
                String readString21 = parcel.readString();
                ZonedDateTime zonedDateTime2 = (ZonedDateTime) parcel.readSerializable();
                String readString22 = parcel.readString();
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z2 = false;
                    z6 = true;
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = true;
                }
                String readString23 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z3 = z2;
                }
                return new w0(readString20, readInt18, readString21, zonedDateTime2, readString22, z6, readString23, z3, parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d[i];
            case 1:
                return new com.github.service.models.response.projects.a[i];
            case 2:
                return new f[i];
            case 3:
                return new g[i];
            case 4:
                return new i[i];
            case 5:
                return new j[i];
            case 6:
                return new k[i];
            case 7:
                return new l[i];
            case 8:
                return new com.github.service.models.response.projects.b[i];
            case 9:
                return new o[i];
            case 10:
                return new p[i];
            case 11:
                return new q[i];
            case 12:
                return new s[i];
            case 13:
                return new y[i];
            case 14:
                return new ProjectFieldOption$Iteration[i];
            case 15:
                return new ProjectFieldOption$SingleOption[i];
            case 16:
                return new e0[i];
            case 17:
                return new f0[i];
            case 18:
                return new ProjectV2Field$ProjectV2IterationField[i];
            case 19:
                return new ProjectV2Field$ProjectV2SingleSelectField[i];
            case 20:
                return new ProjectV2Field$ProjectV2TextField[i];
            case 21:
                return new ProjectV2Field$ProjectV2UnknownField[i];
            case 22:
                return new l0[i];
            case 23:
                return new p0[i];
            case 24:
                return new t0[i];
            case 25:
                return new ProjectsMetaInfo[i];
            default:
                return new w0[i];
        }
    }
}
