package wn;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k71.z;
import w61.k;
import x61.m;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public static final a Companion = new a();
    public static final Map a = x.t(new k("sunset_classic_projects", com.github.rudroid.common.a.P));

    public static LinkedHashSet a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map map = a;
        linkedHashSet.addAll(map.values());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (k71.k.b(str, "analytics")) {
                    linkedHashSet.add(com.github.rudroid.common.a.r);
                } else if (k71.k.b(str, "commit_emails")) {
                    linkedHashSet.add(com.github.rudroid.common.a.s);
                } else if (k71.k.b(str, "explore")) {
                    linkedHashSet.add(com.github.rudroid.common.a.t);
                } else if (k71.k.b(str, "help_hub_support")) {
                    linkedHashSet.add(com.github.rudroid.common.a.u);
                } else if (k71.k.b(str, "notification_type_settings")) {
                    linkedHashSet.add(com.github.rudroid.common.a.v);
                } else if (k71.k.b(str, "push_notifications")) {
                    linkedHashSet.add(com.github.rudroid.common.a.w);
                } else if (k71.k.b(str, "report_content")) {
                    linkedHashSet.add(com.github.rudroid.common.a.x);
                } else if (k71.k.b(str, "repository_vulnerability_alerts")) {
                    linkedHashSet.add(com.github.rudroid.common.a.y);
                } else if (k71.k.b(str, "sponsors")) {
                    linkedHashSet.add(com.github.rudroid.common.a.z);
                } else if (k71.k.b(str, "upsell_ci")) {
                    linkedHashSet.add(com.github.rudroid.common.a.A);
                } else if (k71.k.b(str, "push_settings")) {
                    linkedHashSet.add(com.github.rudroid.common.a.B);
                } else if (k71.k.b(str, "2fa_auth_requests")) {
                    linkedHashSet.add(com.github.rudroid.common.a.C);
                } else if (k71.k.b(str, "projects_next")) {
                    linkedHashSet.add(com.github.rudroid.common.a.D);
                } else if (k71.k.b(str, "merge_queue")) {
                    linkedHashSet.add(com.github.rudroid.common.a.E);
                } else if (k71.k.b(str, "repository_actions")) {
                    linkedHashSet.add(com.github.rudroid.common.a.F);
                } else if (k71.k.b(str, "tasklists")) {
                    linkedHashSet.add(com.github.rudroid.common.a.G);
                } else if (k71.k.b(str, "update_branch_method")) {
                    linkedHashSet.add(com.github.rudroid.common.a.H);
                } else if (k71.k.b(str, "starred_repositories_search")) {
                    linkedHashSet.add(com.github.rudroid.common.a.I);
                } else if (k71.k.b(str, "update_pull_request_base_branch")) {
                    linkedHashSet.add(com.github.rudroid.common.a.J);
                } else if (k71.k.b(str, "code_search")) {
                    linkedHashSet.add(com.github.rudroid.common.a.K);
                } else if (k71.k.b(str, "copilot_chat")) {
                    linkedHashSet.add(com.github.rudroid.common.a.L);
                } else if (k71.k.b(str, "viewer_feature_flags")) {
                    linkedHashSet.add(com.github.rudroid.common.a.M);
                } else if (k71.k.b(str, "workflow_dispatching")) {
                    linkedHashSet.add(com.github.rudroid.common.a.N);
                } else if (k71.k.b(str, "client_apps_important_inbox")) {
                    linkedHashSet.add(com.github.rudroid.common.a.O);
                } else if (k71.k.b(str, "fork_repository")) {
                    linkedHashSet.add(com.github.rudroid.common.a.Q);
                } else if (k71.k.b(str, "compare_branches")) {
                    linkedHashSet.add(com.github.rudroid.common.a.R);
                } else if (k71.k.b(str, "sub_issues")) {
                    linkedHashSet.add(com.github.rudroid.common.a.S);
                } else if (k71.k.b(str, "close_issue_as_duplicate")) {
                    linkedHashSet.add(com.github.rudroid.common.a.T);
                } else if (k71.k.b(str, "merge_requirements")) {
                    linkedHashSet.add(com.github.rudroid.common.a.U);
                } else if (k71.k.b(str, "agent_tasks")) {
                    linkedHashSet.add(com.github.rudroid.common.a.V);
                } else if (k71.k.b(str, "commenting_outside_diff")) {
                    linkedHashSet.add(com.github.rudroid.common.a.W);
                } else if (k71.k.b(str, "cca_issues")) {
                    linkedHashSet.add(com.github.rudroid.common.a.X);
                } else if (k71.k.b(str, "viewer_relevant_repositories")) {
                    linkedHashSet.add(com.github.rudroid.common.a.Y);
                } else if (m.N(map.keySet(), str)) {
                    Object obj = map.get(str);
                    z.a(linkedHashSet);
                    linkedHashSet.remove(obj);
                }
            }
        }
        return linkedHashSet;
    }
}
