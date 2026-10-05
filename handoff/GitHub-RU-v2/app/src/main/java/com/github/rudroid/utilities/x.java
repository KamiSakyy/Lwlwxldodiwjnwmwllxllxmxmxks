package com.github.rudroid.utilities;

import com.github.service.models.response.type.MobileEventContext;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x {
    public static final String a(String str, String str2, String str3) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        if (str3 == null) {
            str3 = "new_issue";
        }
        StringBuilder o = a0.s0.o("AgentAssignment_", str, "/", str2, "/");
        o.append(str3);
        return o.toString();
    }

    public static final String b(MobileEventContext mobileEventContext, String str, String str2, String str3) {
        k71.k.g(mobileEventContext, "eventContext");
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        StringBuilder sb = new StringBuilder("RepositoryScopeDraft_");
        sb.append(mobileEventContext);
        sb.append(":");
        sb.append(str);
        sb.append("/");
        return no.a.q(sb, str2, "/", str3);
    }

    public static final String c(String str) {
        k71.k.g(str, "<this>");
        return "AgentTask_Reference_".concat(str);
    }
}
