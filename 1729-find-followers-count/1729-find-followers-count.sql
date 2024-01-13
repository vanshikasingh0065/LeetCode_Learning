# Write your MySQL query statement below


select  f.user_id  as user_id, COUNT(f.follower_id) as followers_count from Followers f group by user_id order by user_id asc;