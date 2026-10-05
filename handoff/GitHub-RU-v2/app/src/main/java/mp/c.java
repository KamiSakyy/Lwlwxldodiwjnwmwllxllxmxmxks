package mp;

import com.github.service.dotcom.models.response.copilot.AgentTaskResponse;
import com.github.service.dotcom.models.response.copilot.AgentTaskSessionResponse;
import com.github.service.dotcom.models.response.copilot.CreateAgentTaskPullsResponse;
import com.github.service.dotcom.models.response.copilot.EventsResponse;
import com.github.service.dotcom.models.response.copilot.SteerAgentTaskRequest;
import fa1.q0;
import ga1.f;
import ga1.o;
import ga1.s;
import ga1.t;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public interface c {
    @o("/agents/tasks/{task_id}/steer")
    Object a(@s("task_id") String str, @ga1.a SteerAgentTaskRequest steerAgentTaskRequest, a71.c<? super a0> cVar);

    @f("/agents/tasks/{task_id}/events")
    Object b(@s("task_id") String str, @t("page") int i, @t("per_page") int i2, a71.c<? super q0<EventsResponse>> cVar);

    @o("/agents/repos/{owner_name}/{repo_name}/tasks/{task_id}/pulls")
    Object c(@s("owner_name") String str, @s("repo_name") String str2, @s("task_id") String str3, a71.c<? super CreateAgentTaskPullsResponse> cVar);

    @f("/agents/sessions/{session_id}")
    Object d(@s("session_id") String str, a71.c<? super AgentTaskSessionResponse> cVar);

    @f("/agents/tasks/{task_id}")
    Object e(@s("task_id") String str, a71.c<? super AgentTaskResponse> cVar);
}
