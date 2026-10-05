package com.github.rudroid.searchandfilter.ui;

import a0.p0;
import android.content.Context;
import androidx.fragment.app.a1;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.domain.searchandfilter.filters.data.AgentTasksSortFilter;
import com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter;
import com.github.domain.searchandfilter.filters.data.AssigneeFilter;
import com.github.domain.searchandfilter.filters.data.AuthorFilter;
import com.github.domain.searchandfilter.filters.data.CustomFilter;
import com.github.domain.searchandfilter.filters.data.CustomInstructionsFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsIsUnansweredFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsTopFilter;
import com.github.domain.searchandfilter.filters.data.IsDraftFilter;
import com.github.domain.searchandfilter.filters.data.IssueStatusFilter;
import com.github.domain.searchandfilter.filters.data.IssueTypeFilter;
import com.github.domain.searchandfilter.filters.data.IssueUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.LabelFilter;
import com.github.domain.searchandfilter.filters.data.LanguageFilter;
import com.github.domain.searchandfilter.filters.data.MilestoneFilter;
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
import com.github.domain.searchandfilter.filters.data.assignee.NoAssignee;
import com.github.domain.searchandfilter.filters.data.label.NoLabel;
import com.github.domain.searchandfilter.filters.data.milestone.NoMilestone;
import com.github.domain.searchandfilter.filters.data.notification.CustomNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.RepositoryNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.SpacerNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.StatusNotificationFilter;
import com.github.rudroid.common.j0;
import com.github.rudroid.common.k0;
import com.github.rudroid.common.m0;
import com.github.rudroid.profile.ui.z0;
import com.github.rudroid.searchandfilter.filterbar.d;
import com.github.rudroid.searchandfilter.filterbar.f;
import com.github.service.models.response.Language;
import com.github.service.models.response.LegacyProjectWithNumber;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.SpokenLanguage;
import com.github.service.models.response.TrendingPeriod;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.organizations.Organization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import yz0.k2;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                m0 m0Var = m0.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                m0 m0Var2 = m0.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                m0 m0Var3 = m0.r;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                m0 m0Var4 = m0.r;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                m0 m0Var5 = m0.r;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                m0 m0Var6 = m0.r;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                m0 m0Var7 = m0.r;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                m0 m0Var8 = m0.r;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                m0 m0Var9 = m0.r;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                m0 m0Var10 = m0.r;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                m0 m0Var11 = m0.r;
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                m0 m0Var12 = m0.r;
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                m0 m0Var13 = m0.r;
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr2 = new int[com.github.rudroid.common.g0.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                com.github.rudroid.common.g0 g0Var = com.github.rudroid.common.g0.r;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                com.github.rudroid.common.g0 g0Var2 = com.github.rudroid.common.g0.r;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                com.github.rudroid.common.g0 g0Var3 = com.github.rudroid.common.g0.r;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                com.github.rudroid.common.g0 g0Var4 = com.github.rudroid.common.g0.r;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            a = iArr2;
            int[] iArr3 = new int[com.github.rudroid.common.w.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                com.github.rudroid.common.w wVar = com.github.rudroid.common.w.r;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                com.github.rudroid.common.w wVar2 = com.github.rudroid.common.w.r;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            int[] iArr4 = new int[com.github.rudroid.common.h0.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                com.github.rudroid.common.h0 h0Var = com.github.rudroid.common.h0.r;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                com.github.rudroid.common.h0 h0Var2 = com.github.rudroid.common.h0.r;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                com.github.rudroid.common.h0 h0Var3 = com.github.rudroid.common.h0.r;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                com.github.rudroid.common.h0 h0Var4 = com.github.rudroid.common.h0.r;
                iArr4[4] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr5 = new int[com.github.rudroid.common.x.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                com.github.rudroid.common.x xVar = com.github.rudroid.common.x.r;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                com.github.rudroid.common.x xVar2 = com.github.rudroid.common.x.r;
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                com.github.rudroid.common.x xVar3 = com.github.rudroid.common.x.r;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            int[] iArr6 = new int[j0.values().length];
            try {
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                j0 j0Var = j0.r;
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                j0 j0Var2 = j0.r;
                iArr6[2] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr7 = new int[k0.values().length];
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                k0 k0Var = k0.s;
                iArr7[1] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                k0 k0Var2 = k0.s;
                iArr7[2] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                k0 k0Var3 = k0.s;
                iArr7[3] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                k0 k0Var4 = k0.s;
                iArr7[4] = 5;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                k0 k0Var5 = k0.s;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                k0 k0Var6 = k0.s;
                iArr7[6] = 7;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                k0 k0Var7 = k0.s;
                iArr7[7] = 8;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                k0 k0Var8 = k0.s;
                iArr7[8] = 9;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr8 = new int[bm.h.values().length];
            try {
                iArr8[0] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                bm.h hVar = bm.h.r;
                iArr8[1] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr9 = new int[bm.j.values().length];
            try {
                iArr9[0] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                bm.j jVar = bm.j.r;
                iArr9[1] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                bm.j jVar2 = bm.j.r;
                iArr9[2] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                bm.j jVar3 = bm.j.r;
                iArr9[3] = 4;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                bm.j jVar4 = bm.j.r;
                iArr9[4] = 5;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                bm.j jVar5 = bm.j.r;
                iArr9[5] = 6;
            } catch (NoSuchFieldError unused51) {
            }
            int[] iArr10 = new int[v01.d.values().length];
            try {
                iArr10[0] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                v01.d dVar = v01.d.r;
                iArr10[1] = 2;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                v01.d dVar2 = v01.d.r;
                iArr10[2] = 3;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                v01.d dVar3 = v01.d.r;
                iArr10[3] = 4;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                v01.d dVar4 = v01.d.r;
                iArr10[4] = 5;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                v01.d dVar5 = v01.d.r;
                iArr10[5] = 6;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                v01.d dVar6 = v01.d.r;
                iArr10[6] = 7;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                v01.d dVar7 = v01.d.r;
                iArr10[7] = 8;
            } catch (NoSuchFieldError unused59) {
            }
            int[] iArr11 = new int[com.github.rudroid.common.h.values().length];
            try {
                iArr11[0] = 1;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                com.github.rudroid.common.h hVar2 = com.github.rudroid.common.h.r;
                iArr11[1] = 2;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                com.github.rudroid.common.h hVar3 = com.github.rudroid.common.h.r;
                iArr11[2] = 3;
            } catch (NoSuchFieldError unused62) {
            }
            int[] iArr12 = new int[v01.c.values().length];
            try {
                iArr12[v01.c.t.ordinal()] = 1;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr12[v01.c.u.ordinal()] = 2;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr12[v01.c.v.ordinal()] = 3;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr12[v01.c.w.ordinal()] = 4;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr12[v01.c.x.ordinal()] = 5;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr12[v01.c.y.ordinal()] = 6;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr12[v01.c.z.ordinal()] = 7;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr12[v01.c.A.ordinal()] = 8;
            } catch (NoSuchFieldError unused70) {
            }
            int[] iArr13 = new int[com.github.rudroid.common.e0.values().length];
            try {
                iArr13[0] = 1;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                com.github.rudroid.common.e0 e0Var = com.github.rudroid.common.e0.r;
                iArr13[1] = 2;
            } catch (NoSuchFieldError unused72) {
            }
            int[] iArr14 = new int[com.github.rudroid.common.f0.values().length];
            try {
                iArr14[0] = 1;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                com.github.rudroid.common.f0 f0Var = com.github.rudroid.common.f0.r;
                iArr14[1] = 2;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                com.github.rudroid.common.f0 f0Var2 = com.github.rudroid.common.f0.r;
                iArr14[2] = 3;
            } catch (NoSuchFieldError unused75) {
            }
            int[] iArr15 = new int[com.github.rudroid.common.d0.values().length];
            try {
                iArr15[0] = 1;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                com.github.rudroid.common.d0 d0Var = com.github.rudroid.common.d0.r;
                iArr15[1] = 2;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                com.github.rudroid.common.d0 d0Var2 = com.github.rudroid.common.d0.r;
                iArr15[2] = 3;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                com.github.rudroid.common.d0 d0Var3 = com.github.rudroid.common.d0.r;
                iArr15[3] = 4;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                com.github.rudroid.common.d0 d0Var4 = com.github.rudroid.common.d0.r;
                iArr15[4] = 5;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                com.github.rudroid.common.d0 d0Var5 = com.github.rudroid.common.d0.r;
                iArr15[5] = 6;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                com.github.rudroid.common.d0 d0Var6 = com.github.rudroid.common.d0.r;
                iArr15[6] = 7;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                com.github.rudroid.common.d0 d0Var7 = com.github.rudroid.common.d0.r;
                iArr15[7] = 8;
            } catch (NoSuchFieldError unused83) {
            }
            int[] iArr16 = new int[cm.a.values().length];
            try {
                iArr16[0] = 1;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr16[cm.a.t.ordinal()] = 2;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr16[cm.a.u.ordinal()] = 3;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr16[cm.a.v.ordinal()] = 4;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr16[cm.a.w.ordinal()] = 5;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr16[cm.a.x.ordinal()] = 6;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr16[cm.a.y.ordinal()] = 7;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr16[cm.a.z.ordinal()] = 8;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr16[cm.a.A.ordinal()] = 9;
            } catch (NoSuchFieldError unused92) {
            }
            int[] iArr17 = new int[on.g.values().length];
            try {
                iArr17[on.g.s.ordinal()] = 1;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr17[on.g.t.ordinal()] = 2;
            } catch (NoSuchFieldError unused94) {
            }
        }
    }

    public static final String a(com.github.domain.searchandfilter.filters.data.notification.a aVar, Context context) {
        if (aVar instanceof CustomNotificationFilter) {
            return ((CustomNotificationFilter) aVar).t;
        }
        if (aVar instanceof StatusNotificationFilter) {
            return ((StatusNotificationFilter) aVar).h(context);
        }
        if (aVar instanceof RepositoryNotificationFilter) {
            return ((RepositoryNotificationFilter) aVar).u;
        }
        if (aVar instanceof SpacerNotificationFilter) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(v01.c cVar) {
        k71.k.g(cVar, "<this>");
        switch (cVar.ordinal()) {
            case 0:
                return 2131953586;
            case 1:
                return 2131953585;
            case 2:
                return 2131953582;
            case 3:
                return 2131953581;
            case 4:
                return 2131953583;
            case 5:
                return 2131953584;
            case 6:
                return 2131953588;
            case 7:
                return 2131953587;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String c(bm.h hVar, Context context) {
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131954314);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String string2 = context.getString(2131954313);
        k71.k.f(string2, "getString(...)");
        return string2;
    }

    public static final String d(bm.j jVar, Context context) {
        int ordinal = jVar.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131954258);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (ordinal == 1) {
            String string2 = context.getString(2131954259);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal == 2) {
            String string3 = context.getString(2131954263);
            k71.k.f(string3, "getString(...)");
            return string3;
        }
        if (ordinal == 3) {
            String string4 = context.getString(2131954261);
            k71.k.f(string4, "getString(...)");
            return string4;
        }
        if (ordinal == 4) {
            String string5 = context.getString(2131954260);
            k71.k.f(string5, "getString(...)");
            return string5;
        }
        if (ordinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        String string6 = context.getString(2131954262);
        k71.k.f(string6, "getString(...)");
        return string6;
    }

    public static final String e(cm.a aVar, Context context) {
        int i;
        k71.k.g(aVar, "<this>");
        switch (aVar.ordinal()) {
            case 0:
                i = 2131954307;
                break;
            case 1:
                i = 2131954290;
                break;
            case 2:
                i = 2131954291;
                break;
            case 3:
                i = 2131954292;
                break;
            case 4:
                i = 2131954293;
                break;
            case 5:
                i = 2131954294;
                break;
            case 6:
                i = 2131954295;
                break;
            case 7:
                i = 2131954296;
                break;
            case 8:
                i = 2131954297;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string = context.getString(i);
        k71.k.f(string, "getString(...)");
        return string;
    }

    public static final String f(com.github.rudroid.common.h hVar, Context context) {
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131954310);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (ordinal == 1) {
            String string2 = context.getString(2131954308);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = context.getString(2131954307);
        k71.k.f(string3, "getString(...)");
        return string3;
    }

    public static final String g(com.github.rudroid.common.w wVar, Context context) {
        int ordinal = wVar.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131954310);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (ordinal == 1) {
            String string2 = context.getString(2131954308);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = context.getString(2131954307);
        k71.k.f(string3, "getString(...)");
        return string3;
    }

    public static final String h(com.github.rudroid.common.x xVar, Context context) {
        int ordinal = xVar.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131954314);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (ordinal == 1) {
            String string2 = context.getString(2131954312);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal == 2) {
            String string3 = context.getString(2131954316);
            k71.k.f(string3, "getString(...)");
            return string3;
        }
        if (ordinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String string4 = context.getString(2131954315);
        k71.k.f(string4, "getString(...)");
        return string4;
    }

    public static final String i(com.github.rudroid.common.d0 d0Var, Context context) {
        int i;
        k71.k.g(d0Var, "<this>");
        switch (d0Var.ordinal()) {
            case 0:
                i = 2131954271;
                break;
            case 1:
                i = 2131954270;
                break;
            case 2:
                i = 2131954275;
                break;
            case 3:
                i = 2131954274;
                break;
            case 4:
                i = 2131954268;
                break;
            case 5:
                i = 2131954267;
                break;
            case 6:
                i = 2131954273;
                break;
            case 7:
                i = 2131954272;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string = context.getString(i);
        k71.k.f(string, "getString(...)");
        return string;
    }

    public static final String j(com.github.rudroid.common.e0 e0Var, Context context) {
        k71.k.g(e0Var, "<this>");
        int ordinal = e0Var.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131954276);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String string2 = context.getString(2131954277);
        k71.k.f(string2, "getString(...)");
        return string2;
    }

    public static final String k(com.github.rudroid.common.f0 f0Var, Context context) {
        k71.k.g(f0Var, "<this>");
        int ordinal = f0Var.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131954279);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (ordinal == 1) {
            String string2 = context.getString(2131954278);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = context.getString(2131954280);
        k71.k.f(string3, "getString(...)");
        return string3;
    }

    public static final String l(com.github.rudroid.common.g0 g0Var, Context context) {
        int ordinal = g0Var.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131954310);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (ordinal == 1) {
            String string2 = context.getString(2131954309);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal == 2) {
            String string3 = context.getString(2131954308);
            k71.k.f(string3, "getString(...)");
            return string3;
        }
        if (ordinal == 3) {
            String string4 = context.getString(2131954311);
            k71.k.f(string4, "getString(...)");
            return string4;
        }
        if (ordinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String string5 = context.getString(2131954307);
        k71.k.f(string5, "getString(...)");
        return string5;
    }

    public static final String m(com.github.rudroid.common.h0 h0Var, Context context) {
        int ordinal = h0Var.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131954314);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (ordinal == 1) {
            String string2 = context.getString(2131954312);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal == 2) {
            String string3 = context.getString(2131954316);
            k71.k.f(string3, "getString(...)");
            return string3;
        }
        if (ordinal == 3) {
            String string4 = context.getString(2131954317);
            k71.k.f(string4, "getString(...)");
            return string4;
        }
        if (ordinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        String string5 = context.getString(2131954315);
        k71.k.f(string5, "getString(...)");
        return string5;
    }

    public static final String n(j0 j0Var, Context context) {
        int ordinal = j0Var.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131954319);
            k71.k.f(string, "getString(...)");
            return string;
        }
        if (ordinal == 1) {
            String string2 = context.getString(2131954320);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = context.getString(2131954321);
        k71.k.f(string3, "getString(...)");
        return string3;
    }

    public static final String o(k0 k0Var, Context context) {
        switch (k0Var.ordinal()) {
            case 0:
                String string = context.getString(2131954281);
                k71.k.f(string, "getString(...)");
                return string;
            case 1:
                String string2 = context.getString(2131954286);
                k71.k.f(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = context.getString(2131954288);
                k71.k.f(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = context.getString(2131954282);
                k71.k.f(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = context.getString(2131954285);
                k71.k.f(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = context.getString(2131954289);
                k71.k.f(string6, "getString(...)");
                return string6;
            case 6:
                String string7 = context.getString(2131954287);
                k71.k.f(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = context.getString(2131954283);
                k71.k.f(string8, "getString(...)");
                return string8;
            case 8:
                String string9 = context.getString(2131954284);
                k71.k.f(string9, "getString(...)");
                return string9;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String p(on.g gVar, Context context) {
        int i;
        k71.k.g(gVar, "<this>");
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            i = 2131954302;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2131954303;
        }
        String string = context.getString(2131954306, context.getString(i));
        k71.k.f(string, "getString(...)");
        return string;
    }

    public static final String q(v01.d dVar, Context context) {
        k71.k.g(dVar, "<this>");
        switch (dVar.ordinal()) {
            case 0:
                String string = context.getString(2131953551);
                k71.k.f(string, "getString(...)");
                return string;
            case 1:
                String string2 = context.getString(2131953552);
                k71.k.f(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = context.getString(2131953553);
                k71.k.f(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = context.getString(2131953554);
                k71.k.f(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = context.getString(2131953555);
                k71.k.f(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = context.getString(2131953556);
                k71.k.f(string6, "getString(...)");
                return string6;
            case 6:
                String string7 = context.getString(2131953557);
                k71.k.f(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = context.getString(2131953558);
                k71.k.f(string8, "getString(...)");
                return string8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final f.b.C0002b r(PullRequestStatusFilter pullRequestStatusFilter, Context context, com.github.rudroid.searchandfilter.q qVar, boolean z, boolean z2) {
        Enum[] values = com.github.rudroid.common.g0.values();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Enum r6 : values) {
            if (a.a[r6.ordinal()] == 4 ? z : true) {
                arrayList.add(r6);
            }
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            com.github.rudroid.common.g0 g0Var = (com.github.rudroid.common.g0) obj;
            arrayList2.add(new f.b.C0002b.a.C0003a(g0Var, l(g0Var, context)));
        }
        com.github.rudroid.common.g0 g0Var2 = pullRequestStatusFilter.v;
        f.b.C0002b.a.C0003a c0003a = new f.b.C0002b.a.C0003a(g0Var2, l(g0Var2, context));
        String str = pullRequestStatusFilter.s;
        boolean c = pullRequestStatusFilter.c();
        String string = context.getString(2131953663);
        k71.k.f(string, "getString(...)");
        return new f.b.C0002b(str, arrayList2, c0003a, c, string, z2, new k(qVar, 0));
    }

    public static final com.github.rudroid.searchandfilter.filterbar.f s(com.github.domain.searchandfilter.filters.data.d dVar, Context context, oa.j jVar, a1 a1Var, com.github.rudroid.searchandfilter.q qVar, String str, String str2, boolean z, bm.l lVar, boolean z2) {
        boolean z3;
        k71.k.g(dVar, "<this>");
        bm.l lVar2 = dVar.r;
        k71.k.g(qVar, "filterBarViewModel");
        k71.k.g(str, "owner");
        k71.k.g(str2, "repository");
        if (dVar instanceof AssigneeFilter) {
            AssigneeFilter assigneeFilter = (AssigneeFilter) dVar;
            boolean z4 = lVar == lVar2;
            final m mVar = new m(str, str2, assigneeFilter, z2, a1Var, 0);
            List list = assigneeFilter.v;
            int size = list.size();
            if (size == 0) {
                boolean z5 = z4;
                String str3 = assigneeFilter.s;
                String string = context.getString(2131954234);
                k71.k.f(string, "getString(...)");
                boolean c = assigneeFilter.c();
                String string2 = context.getString(2131953663);
                k71.k.f(string2, "getString(...)");
                final int i = 0;
                return new f.b.c(str3, string, c, string2, z5, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.n
                    public final Object a() {
                        switch (i) {
                            case 0:
                                mVar.a();
                                break;
                            case 1:
                                mVar.a();
                                break;
                            case 2:
                                mVar.a();
                                break;
                            default:
                                mVar.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
            }
            if (size != 1) {
                String str4 = assigneeFilter.s;
                String string3 = context.getString(2131954235);
                k71.k.f(string3, "getString(...)");
                boolean c2 = assigneeFilter.c();
                String string4 = context.getString(2131953663);
                k71.k.f(string4, "getString(...)");
                final int i2 = 3;
                return new f.b.c(str4, string3, c2, string4, z4, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.n
                    public final Object a() {
                        switch (i2) {
                            case 0:
                                mVar.a();
                                break;
                            case 1:
                                mVar.a();
                                break;
                            case 2:
                                mVar.a();
                                break;
                            default:
                                mVar.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.a(list.size()), 32);
            }
            boolean z6 = z4;
            if (!(((yz0.f) x61.m.U(list)) instanceof NoAssignee)) {
                String str5 = assigneeFilter.s;
                String j = sy.d0.j((yz0.f) x61.m.U(list));
                boolean c3 = assigneeFilter.c();
                String string5 = context.getString(2131953663);
                k71.k.f(string5, "getString(...)");
                final int i3 = 2;
                return new f.b.c(str5, j, c3, string5, z6, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.n
                    public final Object a() {
                        switch (i3) {
                            case 0:
                                mVar.a();
                                break;
                            case 1:
                                mVar.a();
                                break;
                            case 2:
                                mVar.a();
                                break;
                            default:
                                mVar.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.b(d.b.a.r), 32);
            }
            String str6 = assigneeFilter.s;
            String string6 = context.getString(2131954256);
            k71.k.f(string6, "getString(...)");
            boolean c4 = assigneeFilter.c();
            String string7 = context.getString(2131953663);
            k71.k.f(string7, "getString(...)");
            final int i4 = 1;
            return new f.b.c(str6, string6, c4, string7, z6, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.n
                public final Object a() {
                    switch (i4) {
                        case 0:
                            mVar.a();
                            break;
                        case 1:
                            mVar.a();
                            break;
                        case 2:
                            mVar.a();
                            break;
                        default:
                            mVar.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, new d.b(d.b.a.A), 32);
        }
        if (dVar instanceof LabelFilter) {
            LabelFilter labelFilter = (LabelFilter) dVar;
            boolean z7 = lVar == lVar2;
            final m mVar2 = new m(str, str2, labelFilter, z2, a1Var, 2);
            List list2 = labelFilter.v;
            int size2 = list2.size();
            if (size2 == 0) {
                String str7 = labelFilter.s;
                String string8 = context.getString(2131954242);
                k71.k.f(string8, "getString(...)");
                boolean c5 = labelFilter.c();
                String string9 = context.getString(2131953663);
                k71.k.f(string9, "getString(...)");
                final int i5 = 0;
                return new f.b.c(str7, string8, c5, string9, z7, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.p
                    public final Object a() {
                        switch (i5) {
                            case 0:
                                mVar2.a();
                                break;
                            case 1:
                                mVar2.a();
                                break;
                            case 2:
                                mVar2.a();
                                break;
                            default:
                                mVar2.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
            }
            if (size2 != 1) {
                String str8 = labelFilter.s;
                String string10 = context.getString(2131954243);
                k71.k.f(string10, "getString(...)");
                boolean c6 = labelFilter.c();
                String string11 = context.getString(2131953663);
                k71.k.f(string11, "getString(...)");
                final int i6 = 3;
                return new f.b.c(str8, string10, c6, string11, z7, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.p
                    public final Object a() {
                        switch (i6) {
                            case 0:
                                mVar2.a();
                                break;
                            case 1:
                                mVar2.a();
                                break;
                            case 2:
                                mVar2.a();
                                break;
                            default:
                                mVar2.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.a(list2.size()), 32);
            }
            boolean z8 = z7;
            if (!(((k2) x61.m.U(list2)) instanceof NoLabel)) {
                String str9 = labelFilter.s;
                String name = ((k2) x61.m.U(list2)).getName();
                boolean c7 = labelFilter.c();
                String string12 = context.getString(2131953663);
                k71.k.f(string12, "getString(...)");
                final int i7 = 2;
                return new f.b.c(str9, name, c7, string12, z8, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.p
                    public final Object a() {
                        switch (i7) {
                            case 0:
                                mVar2.a();
                                break;
                            case 1:
                                mVar2.a();
                                break;
                            case 2:
                                mVar2.a();
                                break;
                            default:
                                mVar2.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.b(d.b.a.x), 32);
            }
            String str10 = labelFilter.s;
            String string13 = context.getString(2131954257);
            k71.k.f(string13, "getString(...)");
            boolean c8 = labelFilter.c();
            String string14 = context.getString(2131953663);
            k71.k.f(string14, "getString(...)");
            final int i8 = 1;
            return new f.b.c(str10, string13, c8, string14, z8, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.p
                public final Object a() {
                    switch (i8) {
                        case 0:
                            mVar2.a();
                            break;
                        case 1:
                            mVar2.a();
                            break;
                        case 2:
                            mVar2.a();
                            break;
                        default:
                            mVar2.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, new d.b(d.b.a.A), 32);
        }
        if (dVar instanceof IssueTypeFilter) {
            IssueTypeFilter issueTypeFilter = (IssueTypeFilter) dVar;
            z3 = lVar == lVar2;
            final w wVar = new w(issueTypeFilter, str2, str, a1Var, 0);
            IssueType issueType = issueTypeFilter.v;
            if (issueType != null) {
                String str11 = issueTypeFilter.s;
                String str12 = issueType.s;
                boolean c9 = issueTypeFilter.c();
                String string15 = context.getString(2131953663);
                k71.k.f(string15, "getString(...)");
                final int i9 = 0;
                return new f.b.c(str11, str12, c9, string15, z3, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.x
                    public final Object a() {
                        switch (i9) {
                            case 0:
                                wVar.a();
                                break;
                            default:
                                wVar.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.b(d.b.a.z), 32);
            }
            String str13 = issueTypeFilter.s;
            String string16 = context.getString(2131954241);
            k71.k.f(string16, "getString(...)");
            boolean c11 = issueTypeFilter.c();
            String string17 = context.getString(2131953663);
            k71.k.f(string17, "getString(...)");
            final int i11 = 1;
            return new f.b.c(str13, string16, c11, string17, z3, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.x
                public final Object a() {
                    switch (i11) {
                        case 0:
                            wVar.a();
                            break;
                        default:
                            wVar.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
        }
        if (dVar instanceof ProjectFilter) {
            ProjectFilter projectFilter = (ProjectFilter) dVar;
            boolean z9 = lVar == lVar2;
            final m mVar3 = new m(str, str2, projectFilter, z2, a1Var, 3);
            List list3 = projectFilter.v;
            int size3 = list3.size();
            if (size3 == 0) {
                String str14 = projectFilter.s;
                String string18 = context.getString(2131954249);
                k71.k.f(string18, "getString(...)");
                boolean c12 = projectFilter.c();
                String string19 = context.getString(2131953663);
                k71.k.f(string19, "getString(...)");
                final int i12 = 0;
                return new f.b.c(str14, string18, c12, string19, z9, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.q
                    public final Object a() {
                        switch (i12) {
                            case 0:
                                mVar3.a();
                                break;
                            case 1:
                                mVar3.a();
                                break;
                            default:
                                mVar3.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
            }
            if (size3 != 1) {
                String str15 = projectFilter.s;
                String string20 = context.getString(2131954250);
                k71.k.f(string20, "getString(...)");
                boolean c13 = projectFilter.c();
                String string21 = context.getString(2131953663);
                k71.k.f(string21, "getString(...)");
                final int i13 = 2;
                return new f.b.c(str15, string20, c13, string21, z9, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.q
                    public final Object a() {
                        switch (i13) {
                            case 0:
                                mVar3.a();
                                break;
                            case 1:
                                mVar3.a();
                                break;
                            default:
                                mVar3.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.a(list3.size()), 32);
            }
            boolean z11 = z9;
            String str16 = projectFilter.s;
            String str17 = ((LegacyProjectWithNumber) x61.m.U(list3)).r.r;
            boolean c14 = projectFilter.c();
            String string22 = context.getString(2131953663);
            k71.k.f(string22, "getString(...)");
            final int i14 = 1;
            return new f.b.c(str16, str17, c14, string22, z11, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.q
                public final Object a() {
                    switch (i14) {
                        case 0:
                            mVar3.a();
                            break;
                        case 1:
                            mVar3.a();
                            break;
                        default:
                            mVar3.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, new d.b(d.b.a.w), 32);
        }
        if (dVar instanceof AuthorFilter) {
            AuthorFilter authorFilter = (AuthorFilter) dVar;
            z3 = lVar == lVar2;
            final m mVar4 = new m(str, str2, authorFilter, z2, a1Var, 4);
            yz0.f fVar = authorFilter.v;
            if (fVar != null) {
                String str18 = authorFilter.s;
                String j2 = sy.d0.j(fVar);
                boolean c15 = authorFilter.c();
                String string23 = context.getString(2131953663);
                k71.k.f(string23, "getString(...)");
                final int i15 = 1;
                return new f.b.c(str18, j2, c15, string23, z3, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.s
                    public final Object a() {
                        switch (i15) {
                            case 0:
                                mVar4.a();
                                break;
                            default:
                                mVar4.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.b(d.b.a.r), 32);
            }
            String str19 = authorFilter.s;
            String string24 = context.getString(2131954233);
            k71.k.f(string24, "getString(...)");
            boolean c16 = authorFilter.c();
            String string25 = context.getString(2131953663);
            k71.k.f(string25, "getString(...)");
            final int i16 = 0;
            return new f.b.c(str19, string24, c16, string25, z3, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.s
                public final Object a() {
                    switch (i16) {
                        case 0:
                            mVar4.a();
                            break;
                        default:
                            mVar4.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
        }
        if (dVar instanceof MilestoneFilter) {
            MilestoneFilter milestoneFilter = (MilestoneFilter) dVar;
            boolean z12 = lVar == lVar2;
            final m mVar5 = new m(str, str2, milestoneFilter, z2, a1Var, 1);
            List list4 = milestoneFilter.v;
            int size4 = list4.size();
            if (size4 == 0) {
                String str20 = milestoneFilter.s;
                String string26 = context.getString(2131954245);
                k71.k.f(string26, "getString(...)");
                boolean c17 = milestoneFilter.c();
                String string27 = context.getString(2131953663);
                k71.k.f(string27, "getString(...)");
                final int i17 = 0;
                return new f.b.c(str20, string26, c17, string27, z12, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.o
                    public final Object a() {
                        switch (i17) {
                            case 0:
                                mVar5.a();
                                break;
                            case 1:
                                mVar5.a();
                                break;
                            case 2:
                                mVar5.a();
                                break;
                            default:
                                mVar5.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
            }
            if (size4 != 1) {
                String str21 = milestoneFilter.s;
                String string28 = context.getString(2131954246);
                k71.k.f(string28, "getString(...)");
                boolean c18 = milestoneFilter.c();
                String string29 = context.getString(2131953663);
                k71.k.f(string29, "getString(...)");
                final int i18 = 3;
                return new f.b.c(str21, string28, c18, string29, z12, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.o
                    public final Object a() {
                        switch (i18) {
                            case 0:
                                mVar5.a();
                                break;
                            case 1:
                                mVar5.a();
                                break;
                            case 2:
                                mVar5.a();
                                break;
                            default:
                                mVar5.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.a(list4.size()), 32);
            }
            boolean z13 = z12;
            if (!(((v2) x61.m.U(list4)) instanceof NoMilestone)) {
                String str22 = milestoneFilter.s;
                String name2 = ((v2) x61.m.U(list4)).getName();
                boolean c19 = milestoneFilter.c();
                String string30 = context.getString(2131953663);
                k71.k.f(string30, "getString(...)");
                final int i19 = 2;
                return new f.b.c(str22, name2, c19, string30, z13, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.o
                    public final Object a() {
                        switch (i19) {
                            case 0:
                                mVar5.a();
                                break;
                            case 1:
                                mVar5.a();
                                break;
                            case 2:
                                mVar5.a();
                                break;
                            default:
                                mVar5.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.b(d.b.a.v), 32);
            }
            String str23 = milestoneFilter.s;
            String string31 = context.getString(2131954222);
            k71.k.f(string31, "getString(...)");
            boolean c21 = milestoneFilter.c();
            String string32 = context.getString(2131953663);
            k71.k.f(string32, "getString(...)");
            final int i21 = 1;
            return new f.b.c(str23, string31, c21, string32, z13, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.o
                public final Object a() {
                    switch (i21) {
                        case 0:
                            mVar5.a();
                            break;
                        case 1:
                            mVar5.a();
                            break;
                        case 2:
                            mVar5.a();
                            break;
                        default:
                            mVar5.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, new d.b(d.b.a.A), 32);
        }
        if (dVar instanceof DiscussionCategoryFilter) {
            DiscussionCategoryFilter discussionCategoryFilter = (DiscussionCategoryFilter) dVar;
            boolean z14 = lVar == lVar2;
            final m mVar6 = new m(str, str2, discussionCategoryFilter, z2, a1Var, 6);
            List list5 = discussionCategoryFilter.v;
            int size5 = list5.size();
            if (size5 == 0) {
                String str24 = discussionCategoryFilter.s;
                String string33 = context.getString(2131954240);
                k71.k.f(string33, "getString(...)");
                boolean c22 = discussionCategoryFilter.c();
                String string34 = context.getString(2131953663);
                k71.k.f(string34, "getString(...)");
                final int i22 = 2;
                return new f.b.c(str24, string33, c22, string34, z14, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.l
                    public final Object a() {
                        switch (i22) {
                            case 0:
                                mVar6.a();
                                break;
                            case 1:
                                mVar6.a();
                                break;
                            default:
                                mVar6.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
            }
            if (size5 != 1) {
                String str25 = discussionCategoryFilter.s;
                String string35 = context.getString(2131954239);
                k71.k.f(string35, "getString(...)");
                boolean c23 = discussionCategoryFilter.c();
                String string36 = context.getString(2131953663);
                k71.k.f(string36, "getString(...)");
                final int i23 = 1;
                return new f.b.c(str25, string35, c23, string36, z14, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.l
                    public final Object a() {
                        switch (i23) {
                            case 0:
                                mVar6.a();
                                break;
                            case 1:
                                mVar6.a();
                                break;
                            default:
                                mVar6.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.a(list5.size()), 32);
            }
            boolean z15 = z14;
            String str26 = discussionCategoryFilter.s;
            String str27 = ((DiscussionCategoryData) x61.m.U(list5)).s;
            boolean c24 = discussionCategoryFilter.c();
            String string37 = context.getString(2131953663);
            k71.k.f(string37, "getString(...)");
            final int i24 = 0;
            return new f.b.c(str26, str27, c24, string37, z15, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.l
                public final Object a() {
                    switch (i24) {
                        case 0:
                            mVar6.a();
                            break;
                        case 1:
                            mVar6.a();
                            break;
                        default:
                            mVar6.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, new d.b(d.b.a.y), 32);
        }
        if (dVar instanceof PullRequestStatusFilter) {
            return r((PullRequestStatusFilter) dVar, context, qVar, z, lVar == lVar2);
        }
        if (!(dVar instanceof RepositoryOwnerRepositoriesFilter)) {
            return t(dVar, context, jVar, a1Var, qVar, z2, lVar);
        }
        RepositoryOwnerRepositoriesFilter repositoryOwnerRepositoriesFilter = (RepositoryOwnerRepositoriesFilter) dVar;
        boolean z16 = lVar == lVar2;
        final com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e eVar = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(9, str, a1Var);
        List list6 = repositoryOwnerRepositoriesFilter.v;
        int size6 = list6.size();
        if (size6 == 0) {
            String str28 = repositoryOwnerRepositoriesFilter.s;
            String string38 = context.getString(2131954252);
            k71.k.f(string38, "getString(...)");
            boolean c25 = repositoryOwnerRepositoriesFilter.c();
            String string39 = context.getString(2131953663);
            k71.k.f(string39, "getString(...)");
            final int i25 = 0;
            return new f.b.c(str28, string38, c25, string39, z16, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.r
                public final Object a() {
                    switch (i25) {
                        case 0:
                            eVar.a();
                            break;
                        case 1:
                            eVar.a();
                            break;
                        default:
                            eVar.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
        }
        if (size6 != 1) {
            String str29 = repositoryOwnerRepositoriesFilter.s;
            String string40 = context.getString(2131954251);
            k71.k.f(string40, "getString(...)");
            boolean c26 = repositoryOwnerRepositoriesFilter.c();
            String string41 = context.getString(2131953663);
            k71.k.f(string41, "getString(...)");
            final int i26 = 2;
            return new f.b.c(str29, string40, c26, string41, z16, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.r
                public final Object a() {
                    switch (i26) {
                        case 0:
                            eVar.a();
                            break;
                        case 1:
                            eVar.a();
                            break;
                        default:
                            eVar.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, new d.a(list6.size()), 32);
        }
        String str30 = repositoryOwnerRepositoriesFilter.s;
        SimpleRepository simpleRepository = (SimpleRepository) x61.m.U(list6);
        String h = f1.e.h(simpleRepository.t, " / ", simpleRepository.r);
        boolean c27 = repositoryOwnerRepositoriesFilter.c();
        String string42 = context.getString(2131953663);
        k71.k.f(string42, "getString(...)");
        final int i27 = 1;
        return new f.b.c(str30, h, c27, string42, z16, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.r
            public final Object a() {
                switch (i27) {
                    case 0:
                        eVar.a();
                        break;
                    case 1:
                        eVar.a();
                        break;
                    default:
                        eVar.a();
                        break;
                }
                return w61.a0.a;
            }
        }, new d.b(d.b.a.t), 32);
    }

    public static final com.github.rudroid.searchandfilter.filterbar.f t(com.github.domain.searchandfilter.filters.data.d dVar, Context context, oa.j jVar, a1 a1Var, com.github.rudroid.searchandfilter.q qVar, boolean z, bm.l lVar) {
        String string;
        String string2;
        k71.k.g(dVar, "<this>");
        bm.l lVar2 = dVar.r;
        k71.k.g(qVar, "filterBarViewModel");
        final int i = 0;
        final int i2 = 1;
        if (dVar instanceof SortFilter) {
            SortFilter sortFilter = (SortFilter) dVar;
            boolean z2 = lVar == lVar2;
            String str = sortFilter.s;
            String string3 = context.getString(2131954306);
            k71.k.f(string3, "getString(...)");
            switch (sortFilter.v.ordinal()) {
                case 0:
                    string2 = context.getString(2131954302);
                    k71.k.f(string2, "getString(...)");
                    break;
                case 1:
                    string2 = context.getString(2131954303);
                    k71.k.f(string2, "getString(...)");
                    break;
                case 2:
                    string2 = context.getString(2131954300);
                    k71.k.f(string2, "getString(...)");
                    break;
                case 3:
                    string2 = context.getString(2131954298);
                    k71.k.f(string2, "getString(...)");
                    break;
                case 4:
                    string2 = context.getString(2131954304);
                    k71.k.f(string2, "getString(...)");
                    break;
                case 5:
                    string2 = context.getString(2131954299);
                    k71.k.f(string2, "getString(...)");
                    break;
                case 6:
                    string2 = "👍";
                    break;
                case 7:
                    string2 = "👎";
                    break;
                case 8:
                    string2 = "😄";
                    break;
                case 9:
                    string2 = "🎉";
                    break;
                case 10:
                    string2 = "😕";
                    break;
                case 11:
                    string2 = "❤️";
                    break;
                case 12:
                    string2 = "🚀";
                    break;
                case 13:
                    string2 = "👀";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String format = String.format(string3, Arrays.copyOf(new Object[]{string2}, 1));
            boolean c = sortFilter.c();
            String string4 = context.getString(2131953663);
            k71.k.f(string4, "getString(...)");
            return new f.b.c(str, format, c, string4, z2, (j71.a) new z0(sortFilter, z, a1Var), (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
        }
        if (dVar instanceof PullRequestStatusFilter) {
            return r((PullRequestStatusFilter) dVar, context, qVar, jVar.f(com.github.rudroid.common.a.E), lVar == lVar2);
        }
        if (dVar instanceof DiscussionsIsUnansweredFilter) {
            DiscussionsIsUnansweredFilter discussionsIsUnansweredFilter = (DiscussionsIsUnansweredFilter) dVar;
            String str2 = discussionsIsUnansweredFilter.s;
            String string5 = context.getString(2131954264);
            k71.k.f(string5, "getString(...)");
            return new f.b.e(str2, string5, discussionsIsUnansweredFilter.v, false, null, new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(11, qVar, discussionsIsUnansweredFilter), 40);
        }
        if (dVar instanceof Separator) {
            k71.k.g(((Separator) dVar).s, "id");
            return new f.c(4);
        }
        int i3 = 15;
        if (dVar instanceof IssueStatusFilter) {
            IssueStatusFilter issueStatusFilter = (IssueStatusFilter) dVar;
            boolean z3 = lVar == lVar2;
            d71.b bVar = com.github.rudroid.common.w.u;
            ArrayList arrayList = new ArrayList(x61.n.F(bVar, 10));
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                com.github.rudroid.common.w wVar = (com.github.rudroid.common.w) it.next();
                arrayList.add(new f.b.C0002b.a.C0003a(wVar, g(wVar, context)));
            }
            com.github.rudroid.common.w wVar2 = issueStatusFilter.v;
            f.b.C0002b.a.C0003a c0003a = new f.b.C0002b.a.C0003a(wVar2, g(wVar2, context));
            String str3 = issueStatusFilter.s;
            boolean c2 = issueStatusFilter.c();
            String string6 = context.getString(2131953663);
            k71.k.f(string6, "getString(...)");
            return new f.b.C0002b(str3, arrayList, c0003a, c2, string6, z3, new k(qVar, i3));
        }
        int i4 = 3;
        if (dVar instanceof PullRequestUserRelationshipFilter) {
            PullRequestUserRelationshipFilter pullRequestUserRelationshipFilter = (PullRequestUserRelationshipFilter) dVar;
            boolean z4 = lVar == lVar2;
            d71.b bVar2 = com.github.rudroid.common.h0.w;
            ArrayList arrayList2 = new ArrayList(x61.n.F(bVar2, 10));
            Iterator it2 = bVar2.iterator();
            while (it2.hasNext()) {
                com.github.rudroid.common.h0 h0Var = (com.github.rudroid.common.h0) it2.next();
                arrayList2.add(new f.b.C0002b.a.C0003a(h0Var, m(h0Var, context)));
            }
            com.github.rudroid.common.h0 h0Var2 = pullRequestUserRelationshipFilter.v;
            f.b.C0002b.a.C0003a c0003a2 = new f.b.C0002b.a.C0003a(h0Var2, m(h0Var2, context));
            String str4 = pullRequestUserRelationshipFilter.s;
            boolean c3 = pullRequestUserRelationshipFilter.c();
            String string7 = context.getString(2131953663);
            k71.k.f(string7, "getString(...)");
            return new f.b.C0002b(str4, arrayList2, c0003a2, c3, string7, z4, new k(qVar, i4));
        }
        if (dVar instanceof IssueUserRelationshipFilter) {
            IssueUserRelationshipFilter issueUserRelationshipFilter = (IssueUserRelationshipFilter) dVar;
            boolean z5 = lVar == lVar2;
            d71.b bVar3 = com.github.rudroid.common.x.v;
            ArrayList arrayList3 = new ArrayList(x61.n.F(bVar3, 10));
            Iterator it3 = bVar3.iterator();
            while (it3.hasNext()) {
                com.github.rudroid.common.x xVar = (com.github.rudroid.common.x) it3.next();
                arrayList3.add(new f.b.C0002b.a.C0003a(xVar, h(xVar, context)));
            }
            com.github.rudroid.common.x xVar2 = issueUserRelationshipFilter.v;
            f.b.C0002b.a.C0003a c0003a3 = new f.b.C0002b.a.C0003a(xVar2, h(xVar2, context));
            String str5 = issueUserRelationshipFilter.s;
            boolean c4 = issueUserRelationshipFilter.c();
            String string8 = context.getString(2131953663);
            k71.k.f(string8, "getString(...)");
            return new f.b.C0002b(str5, arrayList3, c0003a3, c4, string8, z5, new k(qVar, i2));
        }
        final int i5 = 2;
        if (dVar instanceof RepositoriesFilter) {
            RepositoriesFilter repositoriesFilter = (RepositoriesFilter) dVar;
            boolean z6 = lVar == lVar2;
            final z0 z0Var = new z0(z, repositoriesFilter, a1Var, 3);
            List list = repositoriesFilter.v;
            int size = list.size();
            if (size == 0) {
                String str6 = repositoriesFilter.s;
                String string9 = context.getString(2131954252);
                k71.k.f(string9, "getString(...)");
                boolean c5 = repositoriesFilter.c();
                String string10 = context.getString(2131953663);
                k71.k.f(string10, "getString(...)");
                return new f.b.c(str6, string9, c5, string10, z6, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.t
                    public final Object a() {
                        switch (i) {
                            case 0:
                                z0Var.a();
                                break;
                            case 1:
                                z0Var.a();
                                break;
                            default:
                                z0Var.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
            }
            if (size != 1) {
                String str7 = repositoriesFilter.s;
                String string11 = context.getString(2131954251);
                k71.k.f(string11, "getString(...)");
                boolean c6 = repositoriesFilter.c();
                String string12 = context.getString(2131953663);
                k71.k.f(string12, "getString(...)");
                return new f.b.c(str7, string11, c6, string12, z6, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.t
                    public final Object a() {
                        switch (i5) {
                            case 0:
                                z0Var.a();
                                break;
                            case 1:
                                z0Var.a();
                                break;
                            default:
                                z0Var.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.a(list.size()), 32);
            }
            String str8 = repositoriesFilter.s;
            SimpleRepository simpleRepository = (SimpleRepository) x61.m.U(list);
            String h = f1.e.h(simpleRepository.t, " / ", simpleRepository.r);
            boolean c7 = repositoriesFilter.c();
            String string13 = context.getString(2131953663);
            k71.k.f(string13, "getString(...)");
            return new f.b.c(str8, h, c7, string13, z6, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.t
                public final Object a() {
                    switch (i2) {
                        case 0:
                            z0Var.a();
                            break;
                        case 1:
                            z0Var.a();
                            break;
                        default:
                            z0Var.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, new d.b(d.b.a.t), 32);
        }
        if (dVar instanceof RepositoryVisibilityFilter) {
            RepositoryVisibilityFilter repositoryVisibilityFilter = (RepositoryVisibilityFilter) dVar;
            j0 j0Var = repositoryVisibilityFilter.v;
            boolean z7 = lVar == lVar2;
            d71.b bVar4 = j0.t;
            ArrayList arrayList4 = new ArrayList(x61.n.F(bVar4, 10));
            Iterator it4 = bVar4.iterator();
            while (it4.hasNext()) {
                j0 j0Var2 = (j0) it4.next();
                arrayList4.add(new f.b.C0002b.a.C0003a(j0Var2, n(j0Var2, context)));
            }
            String n = n(j0Var, context);
            f.b.C0002b.a.C0003a c0003a4 = new f.b.C0002b.a.C0003a(j0Var, n);
            if (j0Var == j0.r) {
                n = context.getString(2131954318);
            }
            String str9 = n;
            k71.k.d(str9);
            String str10 = repositoryVisibilityFilter.s;
            boolean c8 = repositoryVisibilityFilter.c();
            String string14 = context.getString(2131953663);
            k71.k.f(string14, "getString(...)");
            return new f.b.C0002b(str10, str9, arrayList4, c0003a4, c8, string14, z7, new k(qVar, 11));
        }
        if (dVar instanceof OrganizationFilter) {
            OrganizationFilter organizationFilter = (OrganizationFilter) dVar;
            boolean z8 = lVar == lVar2;
            final z0 z0Var2 = new z0(z, organizationFilter, a1Var, 5);
            List list2 = organizationFilter.v;
            int size2 = list2.size();
            if (size2 == 0) {
                String str11 = organizationFilter.s;
                String string15 = context.getString(2131954247);
                k71.k.f(string15, "getString(...)");
                boolean c9 = organizationFilter.c();
                String string16 = context.getString(2131953663);
                k71.k.f(string16, "getString(...)");
                return new f.b.c(str11, string15, c9, string16, z8, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.y
                    public final Object a() {
                        switch (i) {
                            case 0:
                                z0Var2.a();
                                break;
                            case 1:
                                z0Var2.a();
                                break;
                            default:
                                z0Var2.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
            }
            if (size2 == 1) {
                String str12 = organizationFilter.s;
                String str13 = ((Organization) x61.m.U(list2)).t;
                boolean c11 = organizationFilter.c();
                String string17 = context.getString(2131953663);
                k71.k.f(string17, "getString(...)");
                return new f.b.c(str12, str13, c11, string17, z8, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.y
                    public final Object a() {
                        switch (i2) {
                            case 0:
                                z0Var2.a();
                                break;
                            case 1:
                                z0Var2.a();
                                break;
                            default:
                                z0Var2.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.b(d.b.a.u), 32);
            }
            String str14 = organizationFilter.s;
            String string18 = context.getString(2131954248);
            k71.k.f(string18, "getString(...)");
            boolean c12 = organizationFilter.c();
            String string19 = context.getString(2131953663);
            k71.k.f(string19, "getString(...)");
            return new f.b.c(str14, string18, c12, string19, z8, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.y
                public final Object a() {
                    switch (i5) {
                        case 0:
                            z0Var2.a();
                            break;
                        case 1:
                            z0Var2.a();
                            break;
                        default:
                            z0Var2.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, new d.a(list2.size()), 32);
        }
        int i6 = 7;
        if (dVar instanceof ReviewStatusFilter) {
            ReviewStatusFilter reviewStatusFilter = (ReviewStatusFilter) dVar;
            k0 k0Var = reviewStatusFilter.v;
            boolean z9 = lVar == lVar2;
            d71.b bVar5 = k0.u;
            ArrayList arrayList5 = new ArrayList(x61.n.F(bVar5, 10));
            Iterator it5 = bVar5.iterator();
            while (it5.hasNext()) {
                k0 k0Var2 = (k0) it5.next();
                arrayList5.add(new f.b.C0002b.a.C0003a(k0Var2, o(k0Var2, context)));
            }
            String o = o(k0Var, context);
            f.b.C0002b.a.C0003a c0003a5 = new f.b.C0002b.a.C0003a(k0Var, o);
            if (k0Var == k0.s) {
                o = context.getString(2131954254);
            }
            String str15 = o;
            k71.k.d(str15);
            String str16 = reviewStatusFilter.s;
            boolean c13 = reviewStatusFilter.c();
            String string20 = context.getString(2131953663);
            k71.k.f(string20, "getString(...)");
            return new f.b.C0002b(str16, str15, arrayList5, c0003a5, c13, string20, z9, new k(qVar, i6));
        }
        if (dVar instanceof CustomFilter) {
            CustomFilter customFilter = (CustomFilter) dVar;
            String str17 = customFilter.s;
            String str18 = customFilter.v;
            boolean c14 = customFilter.c();
            String string21 = context.getString(2131954063);
            k71.k.f(string21, "getString(...)");
            return new f.b.a(str17, str18, c14, string21, new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(12, qVar, customFilter));
        }
        if (dVar instanceof DiscussionUserRelationshipFilter) {
            DiscussionUserRelationshipFilter discussionUserRelationshipFilter = (DiscussionUserRelationshipFilter) dVar;
            boolean z11 = lVar == lVar2;
            d71.b bVar6 = bm.h.t;
            ArrayList arrayList6 = new ArrayList(x61.n.F(bVar6, 10));
            Iterator it6 = bVar6.iterator();
            while (it6.hasNext()) {
                bm.h hVar = (bm.h) it6.next();
                arrayList6.add(new f.b.C0002b.a.C0003a(hVar, c(hVar, context)));
            }
            bm.h hVar2 = discussionUserRelationshipFilter.v;
            f.b.C0002b.a.C0003a c0003a6 = new f.b.C0002b.a.C0003a(hVar2, c(hVar2, context));
            String str19 = discussionUserRelationshipFilter.s;
            boolean c15 = discussionUserRelationshipFilter.c();
            String string22 = context.getString(2131953663);
            k71.k.f(string22, "getString(...)");
            return new f.b.C0002b(str19, arrayList6, c0003a6, c15, string22, z11, new k(qVar, i5));
        }
        int i7 = 13;
        if (dVar instanceof DiscussionsTopFilter) {
            DiscussionsTopFilter discussionsTopFilter = (DiscussionsTopFilter) dVar;
            boolean z12 = lVar == lVar2;
            d71.b bVar7 = bm.j.t;
            ArrayList arrayList7 = new ArrayList(x61.n.F(bVar7, 10));
            Iterator it7 = bVar7.iterator();
            while (it7.hasNext()) {
                bm.j jVar2 = (bm.j) it7.next();
                arrayList7.add(new f.b.C0002b.a.C0003a(jVar2, d(jVar2, context)));
            }
            bm.j jVar3 = discussionsTopFilter.v;
            f.b.C0002b.a.C0003a c0003a7 = new f.b.C0002b.a.C0003a(jVar3, d(jVar3, context));
            String str20 = discussionsTopFilter.s;
            boolean c16 = discussionsTopFilter.c();
            String string23 = context.getString(2131953663);
            k71.k.f(string23, "getString(...)");
            return new f.b.C0002b(str20, arrayList7, c0003a7, c16, string23, z12, new k(qVar, i7));
        }
        if (dVar instanceof NotificationIsUnreadFilter) {
            NotificationIsUnreadFilter notificationIsUnreadFilter = (NotificationIsUnreadFilter) dVar;
            boolean z13 = lVar == lVar2;
            int i8 = notificationIsUnreadFilter.v ? 2131953840 : 2131953839;
            String str21 = notificationIsUnreadFilter.s;
            String string24 = context.getString(2131954266);
            k71.k.f(string24, "getString(...)");
            return new f.b.e(str21, string24, notificationIsUnreadFilter.v, z13, context.getString(i8), new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(10, qVar, notificationIsUnreadFilter), 32);
        }
        if (dVar instanceof NotificationImportantFilter) {
            NotificationImportantFilter notificationImportantFilter = (NotificationImportantFilter) dVar;
            int i9 = notificationImportantFilter.v ? 2131953838 : 2131953837;
            String str22 = notificationImportantFilter.s;
            String string25 = context.getString(2131953386);
            k71.k.f(string25, "getString(...)");
            return new f.b.e(str22, string25, notificationImportantFilter.v, notificationImportantFilter.w, context.getString(i9), new p0(notificationImportantFilter, a1Var, context, qVar, 3), 32);
        }
        if (dVar instanceof NotificationFilterFilter) {
            NotificationFilterFilter notificationFilterFilter = (NotificationFilterFilter) dVar;
            boolean z14 = lVar == lVar2;
            com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e eVar = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(17, notificationFilterFilter, a1Var);
            String str23 = notificationFilterFilter.s;
            String a2 = a(notificationFilterFilter.v, context);
            boolean c17 = notificationFilterFilter.c();
            String string26 = context.getString(2131953833);
            k71.k.f(string26, "getString(...)");
            return new f.b.c(str23, a2, c17, string26, z14, (j71.a) new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j(13, eVar), (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
        }
        int i11 = 14;
        if (dVar instanceof NotificationRepositoriesFilter) {
            NotificationRepositoriesFilter notificationRepositoriesFilter = (NotificationRepositoriesFilter) dVar;
            boolean z15 = lVar == lVar2;
            final com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e eVar2 = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(14, notificationRepositoriesFilter, a1Var);
            List list3 = notificationRepositoriesFilter.v;
            int size3 = list3.size();
            if (size3 == 0) {
                String str24 = notificationRepositoriesFilter.s;
                String string27 = context.getString(2131954252);
                k71.k.f(string27, "getString(...)");
                boolean c18 = notificationRepositoriesFilter.c();
                String string28 = context.getString(2131953834);
                k71.k.f(string28, "getString(...)");
                return new f.b.c(str24, string27, c18, string28, z15, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.u
                    public final Object a() {
                        switch (i) {
                            case 0:
                                eVar2.a();
                                break;
                            case 1:
                                eVar2.a();
                                break;
                            default:
                                eVar2.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
            }
            if (size3 == 1) {
                String str25 = notificationRepositoriesFilter.s;
                String a3 = a((com.github.domain.searchandfilter.filters.data.notification.a) x61.m.U(list3), context);
                boolean c19 = notificationRepositoriesFilter.c();
                String string29 = context.getString(2131953834);
                k71.k.f(string29, "getString(...)");
                return new f.b.c(str25, a3, c19, string29, z15, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.u
                    public final Object a() {
                        switch (i2) {
                            case 0:
                                eVar2.a();
                                break;
                            case 1:
                                eVar2.a();
                                break;
                            default:
                                eVar2.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, new d.b(d.b.a.t), 32);
            }
            String str26 = notificationRepositoriesFilter.s;
            String string30 = context.getString(2131954251);
            k71.k.f(string30, "getString(...)");
            boolean c21 = notificationRepositoriesFilter.c();
            String string31 = context.getString(2131953834);
            k71.k.f(string31, "getString(...)");
            return new f.b.c(str26, string30, c21, string31, z15, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.u
                public final Object a() {
                    switch (i5) {
                        case 0:
                            eVar2.a();
                            break;
                        case 1:
                            eVar2.a();
                            break;
                        default:
                            eVar2.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, new d.a(list3.size()), 32);
        }
        if (dVar instanceof LanguageFilter) {
            LanguageFilter languageFilter = (LanguageFilter) dVar;
            boolean z16 = lVar == lVar2;
            final z0 z0Var3 = new z0(z, languageFilter, a1Var, 4);
            Language language = languageFilter.v;
            if (language != null) {
                String str27 = languageFilter.s;
                String str28 = language.r;
                boolean c22 = languageFilter.c();
                String string32 = context.getString(2131953663);
                k71.k.f(string32, "getString(...)");
                return new f.b.c(str27, str28, c22, string32, z16, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.v
                    public final Object a() {
                        switch (i2) {
                            case 0:
                                z0Var3.a();
                                break;
                            default:
                                z0Var3.a();
                                break;
                        }
                        return w61.a0.a;
                    }
                }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
            }
            String str29 = languageFilter.s;
            String string33 = context.getString(2131954244);
            k71.k.f(string33, "getString(...)");
            boolean c23 = languageFilter.c();
            String string34 = context.getString(2131953663);
            k71.k.f(string34, "getString(...)");
            return new f.b.c(str29, string33, c23, string34, z16, new j71.a() { // from class: com.github.rudroid.searchandfilter.ui.v
                public final Object a() {
                    switch (i) {
                        case 0:
                            z0Var3.a();
                            break;
                        default:
                            z0Var3.a();
                            break;
                    }
                    return w61.a0.a;
                }
            }, (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
        }
        if (dVar instanceof SpokenLanguageFilter) {
            SpokenLanguageFilter spokenLanguageFilter = (SpokenLanguageFilter) dVar;
            boolean z17 = lVar == lVar2;
            com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e eVar3 = new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(16, spokenLanguageFilter, a1Var);
            SpokenLanguage spokenLanguage = spokenLanguageFilter.v;
            if (spokenLanguage == null || (string = spokenLanguage.r) == null) {
                string = context.getString(2131954255);
                k71.k.f(string, "getString(...)");
            }
            String str30 = string;
            String str31 = spokenLanguageFilter.s;
            boolean c24 = spokenLanguageFilter.c();
            String string35 = context.getString(2131953663);
            k71.k.f(string35, "getString(...)");
            return new f.b.c(str31, str30, c24, string35, z17, (j71.a) new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j(12, eVar3), (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
        }
        int i12 = 8;
        if (dVar instanceof TrendingPeriodFilter) {
            TrendingPeriodFilter trendingPeriodFilter = (TrendingPeriodFilter) dVar;
            boolean z18 = lVar == lVar2;
            TrendingPeriod[] trendingPeriodArr = {TrendingPeriod.DAILY, TrendingPeriod.WEEKLY, TrendingPeriod.MONTHLY};
            ArrayList arrayList8 = new ArrayList(3);
            for (char c25 = 3; i < c25; c25 = 3) {
                TrendingPeriod trendingPeriod = trendingPeriodArr[i];
                arrayList8.add(new f.b.C0002b.a.C0003a(trendingPeriod, bm.w.a(trendingPeriod, context)));
                i++;
            }
            TrendingPeriod trendingPeriod2 = trendingPeriodFilter.v;
            f.b.C0002b.a.C0003a c0003a8 = new f.b.C0002b.a.C0003a(trendingPeriod2, bm.w.a(trendingPeriod2, context));
            String str32 = trendingPeriodFilter.s;
            boolean c26 = trendingPeriodFilter.c();
            String string36 = context.getString(2131953663);
            k71.k.f(string36, "getString(...)");
            return new f.b.C0002b(str32, arrayList8, c0003a8, c26, string36, z18, new k(qVar, i12));
        }
        if (dVar instanceof RepositoryTypeFilter) {
            RepositoryTypeFilter repositoryTypeFilter = (RepositoryTypeFilter) dVar;
            boolean z19 = lVar == lVar2;
            d71.b bVar8 = v01.d.t;
            ArrayList arrayList9 = new ArrayList(x61.n.F(bVar8, 10));
            Iterator it8 = bVar8.iterator();
            while (it8.hasNext()) {
                v01.d dVar2 = (v01.d) it8.next();
                arrayList9.add(new f.b.C0002b.a.C0003a(dVar2, q(dVar2, context)));
            }
            v01.d dVar3 = repositoryTypeFilter.v;
            f.b.C0002b.a.C0003a c0003a9 = new f.b.C0002b.a.C0003a(dVar3, q(dVar3, context));
            String str33 = repositoryTypeFilter.s;
            boolean c27 = repositoryTypeFilter.c();
            String string37 = context.getString(2131953663);
            k71.k.f(string37, "getString(...)");
            return new f.b.C0002b(str33, arrayList9, c0003a9, c27, string37, z19, new k(qVar, i11));
        }
        if (dVar instanceof RepositorySortFilter) {
            RepositorySortFilter repositorySortFilter = (RepositorySortFilter) dVar;
            boolean z20 = lVar == lVar2;
            String str34 = repositorySortFilter.s;
            String string38 = context.getString(2131954306);
            k71.k.f(string38, "getString(...)");
            String format2 = String.format(string38, Arrays.copyOf(new Object[]{context.getString(b(repositorySortFilter.v))}, 1));
            boolean c28 = repositorySortFilter.c();
            String string39 = context.getString(2131953663);
            k71.k.f(string39, "getString(...)");
            return new f.b.c(str34, format2, c28, string39, z20, (j71.a) new z0(z, repositorySortFilter, a1Var, 1), (com.github.rudroid.searchandfilter.filterbar.d) null, 160);
        }
        int i13 = 9;
        if (dVar instanceof DiscussionStatusFilter) {
            DiscussionStatusFilter discussionStatusFilter = (DiscussionStatusFilter) dVar;
            boolean z21 = lVar == lVar2;
            d71.b bVar9 = com.github.rudroid.common.h.u;
            ArrayList arrayList10 = new ArrayList(x61.n.F(bVar9, 10));
            Iterator it9 = bVar9.iterator();
            while (it9.hasNext()) {
                com.github.rudroid.common.h hVar3 = (com.github.rudroid.common.h) it9.next();
                arrayList10.add(new f.b.C0002b.a.C0003a(hVar3, f(hVar3, context)));
            }
            com.github.rudroid.common.h hVar4 = discussionStatusFilter.v;
            f.b.C0002b.a.C0003a c0003a10 = new f.b.C0002b.a.C0003a(hVar4, f(hVar4, context));
            String str35 = discussionStatusFilter.s;
            boolean c29 = discussionStatusFilter.c();
            String string40 = context.getString(2131953663);
            k71.k.f(string40, "getString(...)");
            return new f.b.C0002b(str35, arrayList10, c0003a10, c29, string40, z21, new k(qVar, i13));
        }
        if (dVar instanceof ProjectScopeFilter) {
            ProjectScopeFilter projectScopeFilter = (ProjectScopeFilter) dVar;
            boolean z22 = lVar == lVar2;
            d71.b bVar10 = com.github.rudroid.common.e0.t;
            ArrayList arrayList11 = new ArrayList(x61.n.F(bVar10, 10));
            Iterator it10 = bVar10.iterator();
            while (it10.hasNext()) {
                com.github.rudroid.common.e0 e0Var = (com.github.rudroid.common.e0) it10.next();
                arrayList11.add(new f.b.C0002b.a.C0003a(e0Var, j(e0Var, context)));
            }
            com.github.rudroid.common.e0 e0Var2 = projectScopeFilter.v;
            f.b.C0002b.a.C0003a c0003a11 = new f.b.C0002b.a.C0003a(e0Var2, j(e0Var2, context));
            String str36 = projectScopeFilter.s;
            boolean c31 = projectScopeFilter.c();
            String string41 = context.getString(2131953663);
            k71.k.f(string41, "getString(...)");
            return new f.b.C0002b(str36, arrayList11, c0003a11, c31, string41, z22, new k(qVar, 10));
        }
        if (dVar instanceof ProjectStatusFilter) {
            ProjectStatusFilter projectStatusFilter = (ProjectStatusFilter) dVar;
            boolean z23 = lVar == lVar2;
            d71.b bVar11 = com.github.rudroid.common.f0.t;
            ArrayList arrayList12 = new ArrayList(x61.n.F(bVar11, 10));
            Iterator it11 = bVar11.iterator();
            while (it11.hasNext()) {
                com.github.rudroid.common.f0 f0Var = (com.github.rudroid.common.f0) it11.next();
                arrayList12.add(new f.b.C0002b.a.C0003a(f0Var, k(f0Var, context)));
            }
            com.github.rudroid.common.f0 f0Var2 = projectStatusFilter.v;
            f.b.C0002b.a.C0003a c0003a12 = new f.b.C0002b.a.C0003a(f0Var2, k(f0Var2, context));
            String str37 = projectStatusFilter.s;
            boolean c32 = projectStatusFilter.c();
            String string42 = context.getString(2131953663);
            k71.k.f(string42, "getString(...)");
            return new f.b.C0002b(str37, arrayList12, c0003a12, c32, string42, z23, new k(qVar, 5));
        }
        if (dVar instanceof ProjectOrderFilter) {
            ProjectOrderFilter projectOrderFilter = (ProjectOrderFilter) dVar;
            com.github.rudroid.common.d0 d0Var = projectOrderFilter.v;
            boolean z24 = lVar == lVar2;
            com.github.rudroid.common.d0 d0Var2 = com.github.rudroid.common.d0.r;
            f.b.C0002b.a.C0003a c0003a13 = new f.b.C0002b.a.C0003a(d0Var2, i(d0Var2, context));
            com.github.rudroid.common.d0 d0Var3 = com.github.rudroid.common.d0.s;
            f.b.C0002b.a.C0003a c0003a14 = new f.b.C0002b.a.C0003a(d0Var3, i(d0Var3, context));
            com.github.rudroid.common.d0 d0Var4 = com.github.rudroid.common.d0.t;
            f.b.C0002b.a.C0003a c0003a15 = new f.b.C0002b.a.C0003a(d0Var4, i(d0Var4, context));
            com.github.rudroid.common.d0 d0Var5 = com.github.rudroid.common.d0.u;
            f.b.C0002b.a.C0003a c0003a16 = new f.b.C0002b.a.C0003a(d0Var5, i(d0Var5, context));
            com.github.rudroid.common.d0 d0Var6 = com.github.rudroid.common.d0.v;
            f.b.C0002b.a.C0003a c0003a17 = new f.b.C0002b.a.C0003a(d0Var6, i(d0Var6, context));
            com.github.rudroid.common.d0 d0Var7 = com.github.rudroid.common.d0.w;
            f.b.C0002b.a.C0003a c0003a18 = new f.b.C0002b.a.C0003a(d0Var7, i(d0Var7, context));
            com.github.rudroid.common.d0 d0Var8 = com.github.rudroid.common.d0.y;
            f.b.C0002b.a.C0003a c0003a19 = new f.b.C0002b.a.C0003a(d0Var8, i(d0Var8, context));
            com.github.rudroid.common.d0 d0Var9 = com.github.rudroid.common.d0.x;
            f.b.C0002b.a.C0003a c0003a20 = new f.b.C0002b.a.C0003a(d0Var9, i(d0Var9, context));
            f.b.C0002b.a.C0004b c0004b = f.b.C0002b.a.C0004b.a;
            List r = x61.l.r(new f.b.C0002b.a[]{c0003a13, c0003a14, c0004b, c0003a15, c0003a16, c0004b, c0003a17, c0003a18, c0004b, c0003a19, c0003a20});
            f.b.C0002b.a.C0003a c0003a21 = new f.b.C0002b.a.C0003a(d0Var, i(d0Var, context));
            String string43 = context.getString(2131954269, i(d0Var, context));
            k71.k.f(string43, "getString(...)");
            String str38 = projectOrderFilter.s;
            boolean c33 = projectOrderFilter.c();
            String string44 = context.getString(2131953663);
            k71.k.f(string44, "getString(...)");
            return new f.b.C0002b(str38, string43, r, c0003a21, c33, string44, z24, new k(qVar, 6));
        }
        if (dVar instanceof ReviewRequestedFilter) {
            ReviewRequestedFilter reviewRequestedFilter = (ReviewRequestedFilter) dVar;
            boolean z25 = lVar == lVar2;
            int i14 = reviewRequestedFilter.v ? 2131953842 : 2131953841;
            String str39 = reviewRequestedFilter.s;
            String string45 = context.getString(2131952618);
            k71.k.f(string45, "getString(...)");
            return new f.b.e(str39, string45, reviewRequestedFilter.v, z25, context.getString(i14), new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(15, qVar, reviewRequestedFilter), 32);
        }
        if (dVar instanceof IsDraftFilter) {
            IsDraftFilter isDraftFilter = (IsDraftFilter) dVar;
            boolean z26 = lVar == lVar2;
            int i15 = isDraftFilter.v ? 2131953836 : 2131953835;
            String str40 = isDraftFilter.s;
            String string46 = context.getString(2131954265);
            k71.k.f(string46, "getString(...)");
            return new f.b.e(str40, string46, isDraftFilter.v, z26, context.getString(i15), new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(13, qVar, isDraftFilter), 32);
        }
        if (dVar instanceof AgentTasksStateFilter) {
            AgentTasksStateFilter agentTasksStateFilter = (AgentTasksStateFilter) dVar;
            d71.b bVar12 = cm.a.C;
            ArrayList arrayList13 = new ArrayList(x61.n.F(bVar12, 10));
            Iterator it12 = bVar12.iterator();
            while (it12.hasNext()) {
                cm.a aVar = (cm.a) it12.next();
                arrayList13.add(new f.b.C0002b.a.C0003a(aVar, e(aVar, context)));
            }
            cm.a aVar2 = agentTasksStateFilter.v;
            f.b.C0002b.a.C0003a c0003a22 = new f.b.C0002b.a.C0003a(aVar2, e(aVar2, context));
            String str41 = agentTasksStateFilter.s;
            boolean c34 = agentTasksStateFilter.c();
            String string47 = context.getString(2131953663);
            k71.k.f(string47, "getString(...)");
            return new f.b.C0002b(str41, arrayList13, c0003a22, c34, string47, false, new k(qVar, 12));
        }
        if (dVar instanceof AgentTasksSortFilter) {
            AgentTasksSortFilter agentTasksSortFilter = (AgentTasksSortFilter) dVar;
            d71.b bVar13 = on.g.v;
            ArrayList arrayList14 = new ArrayList(x61.n.F(bVar13, 10));
            Iterator it13 = bVar13.iterator();
            while (it13.hasNext()) {
                on.g gVar = (on.g) it13.next();
                arrayList14.add(new f.b.C0002b.a.C0003a(gVar, p(gVar, context)));
            }
            on.g gVar2 = agentTasksSortFilter.v;
            f.b.C0002b.a.C0003a c0003a23 = new f.b.C0002b.a.C0003a(gVar2, p(gVar2, context));
            String str42 = agentTasksSortFilter.s;
            boolean c35 = agentTasksSortFilter.c();
            String string48 = context.getString(2131953663);
            k71.k.f(string48, "getString(...)");
            return new f.b.C0002b(str42, arrayList14, c0003a23, c35, string48, false, new k(qVar, 4));
        }
        if (!(dVar instanceof AssigneeFilter) && !(dVar instanceof AuthorFilter) && !(dVar instanceof DiscussionCategoryFilter) && !(dVar instanceof IssueTypeFilter) && !(dVar instanceof LabelFilter) && !(dVar instanceof MilestoneFilter) && !(dVar instanceof ProjectFilter) && !(dVar instanceof com.github.domain.searchandfilter.filters.data.e) && !(dVar instanceof RepositoryOwnerRepositoriesFilter) && !(dVar instanceof CustomInstructionsFilter) && !dVar.equals(StatusFilter$Done.INSTANCE) && !dVar.equals(StatusFilter$Inbox.INSTANCE) && !dVar.equals(StatusFilter$Saved.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Unknown filter encountered: " + dVar).toString());
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a1<T1,T2,T3,T4> {
        public a1() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j0<T1,T2,T3,T4> {
        public j0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class k0<T1,T2,T3,T4> {
        public k0() {
        }
    }
}
