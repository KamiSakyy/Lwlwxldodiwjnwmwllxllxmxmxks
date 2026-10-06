package bm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c21.b0;
import com.github.domain.searchandfilter.filters.data.NotificationFilterFilter;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter;
import com.github.domain.searchandfilter.filters.data.NotificationIsUnreadFilter;
import com.github.domain.searchandfilter.filters.data.NotificationRepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.OrganizationFilter;
import com.github.domain.searchandfilter.filters.data.ProjectFilter;
import com.github.domain.searchandfilter.filters.data.ProjectOrderFilter;
import com.github.domain.searchandfilter.filters.data.ProjectScopeFilter;
import com.github.domain.searchandfilter.filters.data.ProjectStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestStatusFilter;
import com.github.domain.searchandfilter.filters.data.PullRequestUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.RepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryOwnerRepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.RepositorySortFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryTypeFilter;
import com.github.domain.searchandfilter.filters.data.RepositoryVisibilityFilter;
import com.github.domain.searchandfilter.filters.data.ReviewRequestedFilter;
import com.github.domain.searchandfilter.filters.data.ReviewStatusFilter;
import com.github.domain.searchandfilter.filters.data.Separator;
import com.github.domain.searchandfilter.filters.data.SortFilter;
import com.github.domain.searchandfilter.filters.data.SpokenLanguageFilter;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Done;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Inbox;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Saved;
import com.github.domain.searchandfilter.filters.data.TrendingPeriodFilter;
import com.github.rudroid.common.d0;
import com.github.rudroid.common.e0;
import com.github.rudroid.common.f0;
import com.github.rudroid.common.g0;
import com.github.rudroid.common.h0;
import com.github.rudroid.common.i0;
import com.github.rudroid.common.j0;
import com.github.rudroid.common.k0;
import com.github.rudroid.common.m0;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                k71.k.g(parcel, "parcel");
                return new NotificationFilterFilter((com.github.domain.searchandfilter.filters.data.notification.a) parcel.readParcelable(NotificationFilterFilter.class.getClassLoader()));
            case 1:
                k71.k.g(parcel, "parcel");
                return new NotificationImportantFilter(parcel.readInt() != 0, parcel.readInt() != 0);
            case 2:
                k71.k.g(parcel, "parcel");
                return new NotificationIsUnreadFilter(parcel.readInt() != 0);
            case 3:
                k71.k.g(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = f1.e.b(NotificationRepositoriesFilter.class, parcel, arrayList, i, 1);
                }
                return new NotificationRepositoriesFilter(arrayList);
            case 4:
                k71.k.g(parcel, "parcel");
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = f1.e.b(OrganizationFilter.class, parcel, arrayList2, i2, 1);
                }
                return new OrganizationFilter(arrayList2);
            case 5:
                k71.k.g(parcel, "parcel");
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = f1.e.b(ProjectFilter.class, parcel, arrayList3, i3, 1);
                }
                return new ProjectFilter(arrayList3);
            case 6:
                k71.k.g(parcel, "parcel");
                return new ProjectOrderFilter(d0.valueOf(parcel.readString()));
            case 7:
                k71.k.g(parcel, "parcel");
                return new ProjectScopeFilter(e0.valueOf(parcel.readString()));
            case 8:
                k71.k.g(parcel, "parcel");
                return new ProjectStatusFilter(f0.valueOf(parcel.readString()));
            case 9:
                k71.k.g(parcel, "parcel");
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = f1.e.b(com.github.domain.searchandfilter.filters.data.e.class, parcel, arrayList4, i4, 1);
                }
                return new com.github.domain.searchandfilter.filters.data.e(arrayList4);
            case 10:
                k71.k.g(parcel, "parcel");
                return new PullRequestStatusFilter(g0.valueOf(parcel.readString()));
            case 11:
                k71.k.g(parcel, "parcel");
                return new PullRequestUserRelationshipFilter(h0.valueOf(parcel.readString()));
            case 12:
                k71.k.g(parcel, "parcel");
                int readInt5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = f1.e.b(RepositoriesFilter.class, parcel, arrayList5, i5, 1);
                }
                return new RepositoriesFilter(arrayList5, i0.valueOf(parcel.readString()));
            case 13:
                k71.k.g(parcel, "parcel");
                int readInt6 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = f1.e.b(RepositoryOwnerRepositoriesFilter.class, parcel, arrayList6, i6, 1);
                }
                return new RepositoryOwnerRepositoriesFilter(arrayList6);
            case 14:
                k71.k.g(parcel, "parcel");
                return new RepositorySortFilter(v01.c.valueOf(parcel.readString()));
            case 15:
                k71.k.g(parcel, "parcel");
                return new RepositoryTypeFilter(v01.d.valueOf(parcel.readString()));
            case 16:
                k71.k.g(parcel, "parcel");
                return new RepositoryVisibilityFilter(j0.valueOf(parcel.readString()));
            case 17:
                k71.k.g(parcel, "parcel");
                return new ReviewRequestedFilter(parcel.readInt() != 0);
            case 18:
                k71.k.g(parcel, "parcel");
                return new ReviewStatusFilter(k0.valueOf(parcel.readString()));
            case 19:
                k71.k.g(parcel, "parcel");
                return new Separator(parcel.readString());
            case 20:
                k71.k.g(parcel, "parcel");
                return new SortFilter(m0.valueOf(parcel.readString()));
            case 21:
                k71.k.g(parcel, "parcel");
                return new SpokenLanguageFilter(parcel.readParcelable(SpokenLanguageFilter.class.getClassLoader()));
            case 22:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return StatusFilter$Done.INSTANCE;
            case 23:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return StatusFilter$Inbox.INSTANCE;
            case 24:
                k71.k.g(parcel, "parcel");
                parcel.readInt();
                return StatusFilter$Saved.INSTANCE;
            case 25:
                k71.k.g(parcel, "parcel");
                return new TrendingPeriodFilter(parcel.readParcelable(TrendingPeriodFilter.class.getClassLoader()));
            case 26:
                int b0 = k41.b.b0(parcel);
                ArrayList arrayList7 = null;
                int i7 = 0;
                while (parcel.dataPosition() < b0) {
                    int readInt7 = parcel.readInt();
                    char c = (char) readInt7;
                    if (c == 1) {
                        i7 = k41.b.F(parcel, readInt7);
                    } else if (c != 2) {
                        k41.b.N(parcel, readInt7);
                    } else {
                        arrayList7 = k41.b.q(parcel, readInt7, c21.i.CREATOR);
                    }
                }
                k41.b.s(parcel, b0);
                return new c21.l(i7, arrayList7);
            case 27:
                int b02 = k41.b.b0(parcel);
                int i8 = -1;
                int i9 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                String str = null;
                String str2 = null;
                long j = 0;
                long j2 = 0;
                while (parcel.dataPosition() < b02) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i9 = k41.b.F(parcel, readInt8);
                            break;
                        case 2:
                            i11 = k41.b.F(parcel, readInt8);
                            break;
                        case 3:
                            i12 = k41.b.F(parcel, readInt8);
                            break;
                        case 4:
                            j = k41.b.G(parcel, readInt8);
                            break;
                        case 5:
                            j2 = k41.b.G(parcel, readInt8);
                            break;
                        case 6:
                            str = k41.b.o(parcel, readInt8);
                            break;
                        case 7:
                            str2 = k41.b.o(parcel, readInt8);
                            break;
                        case '\b':
                            i13 = k41.b.F(parcel, readInt8);
                            break;
                        case '\t':
                            i8 = k41.b.F(parcel, readInt8);
                            break;
                        default:
                            k41.b.N(parcel, readInt8);
                            break;
                    }
                }
                k41.b.s(parcel, b02);
                return new c21.i(i9, i11, i12, j, j2, str, str2, i13, i8);
            case 28:
                int b03 = k41.b.b0(parcel);
                int i14 = 0;
                boolean z = false;
                boolean z2 = false;
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < b03) {
                    int readInt9 = parcel.readInt();
                    char c2 = (char) readInt9;
                    if (c2 == 1) {
                        i14 = k41.b.F(parcel, readInt9);
                    } else if (c2 == 2) {
                        z = k41.b.D(parcel, readInt9);
                    } else if (c2 == 3) {
                        z2 = k41.b.D(parcel, readInt9);
                    } else if (c2 == 4) {
                        i15 = k41.b.F(parcel, readInt9);
                    } else if (c2 != 5) {
                        k41.b.N(parcel, readInt9);
                    } else {
                        i16 = k41.b.F(parcel, readInt9);
                    }
                }
                k41.b.s(parcel, b03);
                return new c21.k(i14, z, z2, i15, i16);
            default:
                int b04 = k41.b.b0(parcel);
                Bundle bundle = null;
                c21.f fVar = null;
                int i17 = 0;
                z11.d[] dVarArr = null;
                while (parcel.dataPosition() < b04) {
                    int readInt10 = parcel.readInt();
                    char c3 = (char) readInt10;
                    if (c3 == 1) {
                        bundle = k41.b.m(parcel, readInt10);
                    } else if (c3 == 2) {
                        dVarArr = (z11.d[]) k41.b.p(parcel, readInt10, z11.d.CREATOR);
                    } else if (c3 == 3) {
                        i17 = k41.b.F(parcel, readInt10);
                    } else if (c3 != 4) {
                        k41.b.N(parcel, readInt10);
                    } else {
                        fVar = (c21.f) k41.b.n(parcel, readInt10, c21.f.CREATOR);
                    }
                }
                k41.b.s(parcel, b04);
                b0 b0Var = new b0();
                b0Var.r = bundle;
                b0Var.s = dVarArr;
                b0Var.t = i17;
                b0Var.u = fVar;
                return b0Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new NotificationFilterFilter[i];
            case 1:
                return new NotificationImportantFilter[i];
            case 2:
                return new NotificationIsUnreadFilter[i];
            case 3:
                return new NotificationRepositoriesFilter[i];
            case 4:
                return new OrganizationFilter[i];
            case 5:
                return new ProjectFilter[i];
            case 6:
                return new ProjectOrderFilter[i];
            case 7:
                return new ProjectScopeFilter[i];
            case 8:
                return new ProjectStatusFilter[i];
            case 9:
                return new com.github.domain.searchandfilter.filters.data.e[i];
            case 10:
                return new PullRequestStatusFilter[i];
            case 11:
                return new PullRequestUserRelationshipFilter[i];
            case 12:
                return new RepositoriesFilter[i];
            case 13:
                return new RepositoryOwnerRepositoriesFilter[i];
            case 14:
                return new RepositorySortFilter[i];
            case 15:
                return new RepositoryTypeFilter[i];
            case 16:
                return new RepositoryVisibilityFilter[i];
            case 17:
                return new ReviewRequestedFilter[i];
            case 18:
                return new ReviewStatusFilter[i];
            case 19:
                return new Separator[i];
            case 20:
                return new SortFilter[i];
            case 21:
                return new SpokenLanguageFilter[i];
            case 22:
                return new StatusFilter$Done[i];
            case 23:
                return new StatusFilter$Inbox[i];
            case 24:
                return new StatusFilter$Saved[i];
            case 25:
                return new TrendingPeriodFilter[i];
            case 26:
                return new c21.l[i];
            case 27:
                return new c21.i[i];
            case 28:
                return new c21.k[i];
            default:
                return new b0[i];
        }
    }
}
