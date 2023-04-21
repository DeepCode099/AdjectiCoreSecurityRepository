INSERT INTO public.role_(
	roleid, company_id, create_date, description, modified_date, name, sub_type, title, type, user_id)
	VALUES (1, 1, CURRENT_TIMESTAMP, 'this table defines the roles', CURRENT_TIMESTAMP, 'ROLE_USER', 'nothing', 'user role ',1 ,0);


INSERT INTO public.role_(
	roleid, company_id, create_date, description, modified_date, name, sub_type, title, type, user_id)
	VALUES (2, 2, CURRENT_TIMESTAMP, 'this table defines the roles', CURRENT_TIMESTAMP, 'ROLE_ADMIN', 'nothing', 'admin role ',1 ,0);
