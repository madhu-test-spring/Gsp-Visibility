package com.apll.lss.gspPlus.vis.Entity;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;

import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.annotations.NamedNativeQueries;

import com.apll.lss.gspPlus.vis.DTO.QueryFromJoin;
import com.apll.lss.gspPlus.vis.DTO.QueryScreenAtr;
import com.apll.lss.gspPlus.vis.DTO.ScreenJsonDTO;



@Entity
@SqlResultSetMappings({
	@SqlResultSetMapping(
			name="getSpecificJsonResultSet",
			classes= {
				     	@ConstructorResult(
							targetClass=ScreenJsonDTO.class,
							columns= {
										@ColumnResult(name="section_name", type=String.class),
										@ColumnResult(name="app_level_skey", type=Integer.class),
										@ColumnResult(name="entity_skey", type=Integer.class),
										@ColumnResult(name="section_type", type=String.class),
										@ColumnResult(name="json_file", type=String.class),
										@ColumnResult(name="base_json", type=String.class)
							        }					
							)
			          }
			),
	@SqlResultSetMapping(
			name="getQueryScreenAtrResultSet",
			classes= {
				     	@ConstructorResult(
							targetClass=QueryScreenAtr.class,
							columns= {
										@ColumnResult(name="screen_name", type=String.class),
										@ColumnResult(name="field_name", type=String.class),
										@ColumnResult(name="field_source", type=String.class)
									 }					
							)
			          }
			),
	@SqlResultSetMapping(
			name="getQueryFromJoinResultSet",
			classes= {
				     	@ConstructorResult(
							targetClass=QueryFromJoin.class,
							columns= {
										@ColumnResult(name="screen_name", type=String.class),
										@ColumnResult(name="table_names", type=String.class),
										@ColumnResult(name="table_from_type", type=String.class),
										@ColumnResult(name="table_attribute_list", type=String.class),
										@ColumnResult(name="join_condition", type=String.class),
										@ColumnResult(name="order_by_cond", type=String.class)														
									}					
							)
			          }
			)
		
		
})
@NamedNativeQueries({
	@NamedNativeQuery(
			name="getSpecificJson",
			query="SELECT * FROM SCREEN_JSON WHERE ENTITY_SKEY=366",
			resultSetMapping ="getSpecificJsonResultSet",
			fetchSize=400
			
			),
	@NamedNativeQuery(
			name="getQryScreenAtr",
			query="SELECT * FROM QUERY_SCREEN_ATTRIBUTES",
			resultSetMapping ="getQueryScreenAtrResultSet",
			fetchSize=400
			
			),
	@NamedNativeQuery(
			name="getQryFromJoin",
			query="SELECT * FROM QUERY_FROM_JOIN",
			resultSetMapping ="getQueryFromJoinResultSet",
			fetchSize=400
			
			)


})
public class ScreenJsonEntity {
	
	@Id
	private int id;

	
	public ScreenJsonEntity() {
		super();
		
	}
	
	

}
