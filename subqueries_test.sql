use adlister_db;

# SELECT username
# FROM users
# WHERE id IN(
# SELECT id = 4
# FROM ads);


SELECT username
FROM users
JOIN ads on users.id = ads.user_id
WHERE ads.id = '2';



