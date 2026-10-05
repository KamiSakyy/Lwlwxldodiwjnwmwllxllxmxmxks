package wa;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.WorkflowRunEvent;
import java.time.ZonedDateTime;
import mn.j;
import mn.k;
import mn.m;
import x61.l;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {
    static {
        k kVar = k.r;
        CheckStatusState checkStatusState = CheckStatusState.IN_PROGRESS;
        mn.a aVar = new mn.a(kVar, "id", "99", "Name", checkStatusState, (CheckConclusionState) null, "Title", "WorkflowTitle", 123, "Summary", ZonedDateTime.now().minusMinutes(35L), ZonedDateTime.now(), "permalink", Boolean.TRUE);
        x01.i.Companion.getClass();
        mn.e eVar = new mn.e(500, l.r(new mn.a[]{aVar, aVar}), x01.i.d);
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
        ZonedDateTime now2 = ZonedDateTime.now();
        k71.k.f(now2, "now(...)");
        new j("id", "workflowName", now, now2, 2000, 8000, "path/to/a/resource", "https://github.com/hubbers/repo/actions/runs/6516598165168");
        new mn.g("checkSuiteId", "prTitle", new com.github.service.models.response.a("ghost", (Avatar) null, (String) null, false, (String) null, 62), "repoName", "abbreviatedOid", "commitId", "stevepopovichisacoolguy/cool-branch", new com.github.service.models.response.a("ghost", (Avatar) null, (String) null, false, (String) null, 62), checkStatusState, (CheckConclusionState) null, 0, new m(1, 1, 1, 1, 1, 1), eVar, eVar, (j) null, "an/url", true, true, 900, 10, (Avatar) null, WorkflowRunEvent.PULL_REQUEST);
    }
}
