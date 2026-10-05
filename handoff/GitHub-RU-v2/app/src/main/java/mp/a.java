package mp;

import com.github.service.dotcom.models.response.copilot.AgentAiModelsResponse;
import com.github.service.dotcom.models.response.copilot.ChatAiModelsResponse;
import fa1.q0;
import ga1.f;
import ga1.o;
import ga1.s;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public interface a {
    @f("/agents/swe/models")
    Object a(a71.c<? super AgentAiModelsResponse> cVar);

    @o("/models/{id}/policy")
    Object b(@s("id") String str, a71.c<? super q0<a0>> cVar);

    @f("/models")
    Object c(a71.c<? super ChatAiModelsResponse> cVar);
}
