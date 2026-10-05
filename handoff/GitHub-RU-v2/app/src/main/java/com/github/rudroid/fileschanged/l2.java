package com.github.rudroid.fileschanged;

import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class l2 {
    public static final f01.g a(f01.g gVar, Map map) {
        Boolean bool = (Boolean) map.get(new n5(gVar.a));
        yz0.s sVar = gVar.q;
        Boolean bool2 = (Boolean) map.get(new a(sVar.getId()));
        boolean booleanValue = bool != null ? bool.booleanValue() : gVar.o;
        yz0.x2 x2Var = gVar.p;
        yz0.x2 a10 = yz0.x2.a(x2Var, bool2 != null ? bool2.booleanValue() : x2Var.b);
        String str = gVar.a;
        String str2 = gVar.b;
        String str3 = gVar.c;
        PullRequestReviewCommentState pullRequestReviewCommentState = gVar.d;
        String str4 = gVar.e;
        String str5 = gVar.f;
        DiffLineType diffLineType = gVar.g;
        String str6 = gVar.h;
        String str7 = gVar.i;
        boolean z10 = gVar.j;
        boolean z11 = gVar.k;
        String str8 = gVar.l;
        boolean z12 = gVar.m;
        boolean z13 = gVar.n;
        List list = gVar.r;
        boolean z14 = gVar.s;
        Integer num = gVar.t;
        Integer num2 = gVar.u;
        DiffLineType diffLineType2 = gVar.v;
        DiffLineType diffLineType3 = gVar.w;
        boolean z15 = gVar.x;
        boolean z16 = gVar.y;
        boolean z17 = gVar.z;
        CommentLevelType commentLevelType = gVar.A;
        k71.k.g(str, "threadId");
        k71.k.g(str3, "path");
        k71.k.g(pullRequestReviewCommentState, "state");
        k71.k.g(diffLineType, "lineType");
        k71.k.g(str6, "pullRequestId");
        k71.k.g(str7, "headRefOid");
        k71.k.g(str8, "resolvedBy");
        k71.k.g(list, "reactions");
        k71.k.g(diffLineType2, "multiLineStartLineType");
        k71.k.g(diffLineType3, "multiLineEndLineType");
        k71.k.g(commentLevelType, "commentLevelType");
        return new f01.g(str, str2, str3, pullRequestReviewCommentState, str4, str5, diffLineType, str6, str7, z10, z11, str8, z12, z13, booleanValue, a10, sVar, list, z14, num, num2, diffLineType2, diffLineType3, z15, z16, z17, commentLevelType);
    }
}
