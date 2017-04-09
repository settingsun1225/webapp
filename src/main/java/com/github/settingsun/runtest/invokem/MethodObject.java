package com.github.settingsun.runtest.invokem;

/**
 * Created by settingsun1225 on 17/4/9.
 */
public class MethodObject {
    public Result getR(Integer id) {
        Result result = new Result();
        result.setId(id * id);
        result.setMsg("get a result: org_id=" + id);
        return result;
    }

    public class Result {
        private int id;
        private String msg;

        @Override
        public String toString() {
            return "Result=[id="+id+"],[msg="+msg+"].";
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
