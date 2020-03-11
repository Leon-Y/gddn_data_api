
package monitoring.service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class Pagination<T> {
    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 当前页码
     */
    private Integer currentPage;
    /**
     * 每页行数
     */
    private Integer rowsPerPage;
    /**
     * 当前页行数
     */
    private Integer currentRowNum;
    /**
     * 总行数
     */
    private Integer totalRowNum;

    /**
     * 查询结果
     */
    private List<T> dataList;

}
